package cd;

/* JADX INFO: loaded from: classes3.dex */
public interface e<R> extends b<R>, jc.b<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // cd.b
    boolean isSuspend();
}
