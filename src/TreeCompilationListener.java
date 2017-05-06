import org.objectweb.asm.*;

public final class TreeCompilationListener extends DateCalculatorBaseListener {
    private final MethodVisitor _mv;
    private int _currentTreeDepth, _maxTreeDepth;

    public int getTreeDepth(){
        return this._maxTreeDepth;
    }

    public TreeCompilationListener(MethodVisitor mv) {
        this._mv = mv;
    }

    @Override
    public void enterExpression(DateCalculatorParser.ExpressionContext ctx) {
        this._currentTreeDepth = 0;
        this._maxTreeDepth = 0;
    }
}
