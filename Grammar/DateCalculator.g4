grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;

LiczbaNaturalna : [1-9]+ [0-9]*;
Cyfra 			: '0'..'9';

Liczba 			: LiczbaNaturalna | '0' | '00';
Add           	: '+';
Subtract      	: '-';

MiesiacDlugiLiczbowo : (('0')? ('1' | '3' | '5' | '7' | '8')) | ('10'| '12');
MiesiacKrotkiLiczbowo : (('0')? ('4' | '6' | '9')) | '11';
LutyLiczbowo          : '02' | '2';

MiesiacDlugiSlownie :    'stycznia'
				 | 'marca'
				 | 'maja'
				 | 'lipca'
				 | 'sierpnia'
				 | 'października'
				 | 'grudnia' ;
				 
MiesiacKrotkiSlownie :    'kwietnia'
				 | 'czerwca'
				 | 'września'
				 | 'października';

LutySlownie 		  : 'lutego';			 
				 
DzienDoKazdegoMiesiaca  : ('0')?('1'..'9')
						| ('1'..'2')('0'..'9');
			
DniDoKrotkiegoMiesiaca : DzienDoKazdegoMiesiaca | '30';
DniDoDlugiegoMiesiaca  : DniDoKrotkiegoMiesiaca | '31';			
			
Rok : Cyfra Cyfra Cyfra Cyfra;

DataDMRMyslnik : (( DniDoKrotkiegoMiesiaca '-' MiesiacKrotkiLiczbowo)
			| (DniDoDlugiegoMiesiaca '-' MiesiacDlugiLiczbowo) 
			| (DzienDoKazdegoMiesiaca '-' LutyLiczbowo)) 
			('-') Rok;

DataDMRKropka : ((DniDoKrotkiegoMiesiaca '.' MiesiacKrotkiLiczbowo)
			| (DniDoDlugiegoMiesiaca '.' MiesiacDlugiLiczbowo) 
			| (DzienDoKazdegoMiesiaca '.' LutyLiczbowo)) 
			('.') Rok;			

DataMDRSlash : ((MiesiacKrotkiLiczbowo '/' DniDoKrotkiegoMiesiaca)
			| (MiesiacDlugiLiczbowo '/' DniDoDlugiegoMiesiaca) 
			| (LutyLiczbowo '/' DzienDoKazdegoMiesiaca)) 
			('/') Rok;
			
DataDMMMMR: ((DniDoKrotkiegoMiesiaca ' ' MiesiacKrotkiSlownie)
			| (DniDoDlugiegoMiesiaca ' ' MiesiacDlugiSlownie) 
			| (DzienDoKazdegoMiesiaca ' ' LutySlownie)) 
			(' ') Rok;

Godzina : 	(('0')?('1'..'9')) | ('1'('0'..'9')) | ('2'('0'..'3')) | '00';
Godzina12 : 	('1'..'9') | '10' | '11' | '12';
MinutaLubSekunda :   ('0'..'5')?('0'..'9');
			
CzasStd : Godzina ':' MinutaLubSekunda ':' MinutaLubSekunda;
CzasAmPm : Godzina12 ':' MinutaLubSekunda ':' MinutaLubSekunda ('AM' | 'PM');

PrzedzialCzasuDwukropki : 'T:' Liczba ':' Liczba ':' Liczba;
PrzedzialCzasuJava		: 'P' (((LiczbaNaturalna 'D')? ('T' (LiczbaNaturalna'H')? (LiczbaNaturalna'M')? (LiczbaNaturalna'S')?)?) | '0');

DataCzasISO : 	DataDMRMyslnik 'T' CzasStd;
DataCzasDMMMMR : DataDMMMMR ' ' CzasStd;
DataCzasDMRKropka : DataDMRKropka ' ' CzasAmPm;
DataCzasMDRSlash : DataMDRSlash ' ' CzasAmPm;
		
data : format=(DataDMRMyslnik | DataDMRKropka | DataMDRSlash | DataDMMMMR);	  
dataCzas : format=(DataCzasISO | DataCzasDMMMMR | DataCzasDMRKropka| DataCzasMDRSlash);
przedzialCzasu : format=(PrzedzialCzasuJava | PrzedzialCzasuDwukropki);	  
		  

operation2 : (( data | dataCzas | przedzialCzasu) op=( Add | Subtract) ( przedzialCzasu | operation2)) 
			| ((data | dataCzas) op=Subtract (data | dataCzas | operation2)) 
			| (przedzialCzasu) op=Add ( data | dataCzas | przedzialCzasu | operation2);
		  
expression: data | dataCzas | przedzialCzasu | operation2;