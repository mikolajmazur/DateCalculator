grammar ShiftReduce;

fragment SINGLE_SPACE : '\u0020'; // ' '
fragment TABULATION   : '\u0009'; // '\t'

WhiteSpace: ( SINGLE_SPACE | TABULATION )+ -> skip;
Int       : [1-9][0-9]*
          | '0'
          ;

exprAlg : <assoc=right> exprAlg ( '^' | '**' ) exprAlg
        | exprAlg ( '*' | '/' | ':' ) exprAlg
        | exprAlg ( '+' | '-' ) exprAlg
        | Int
        ;
exprRev : <assoc=left> exprRev '^' exprRev // exprRev '^' exprRev
        | exprRev ( '+' | '-' ) exprRev
        | exprRev ( '*' | '/' | ':' ) exprRev
        | Int
        ;
rootAlg : exprAlg
        | Int
        ;
rootRev : exprRev
        | Int
        ;
