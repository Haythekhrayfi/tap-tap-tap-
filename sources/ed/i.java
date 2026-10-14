package ed;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    public static final <T> void a(Appendable appendable, T t10, uc.l<? super T, ? extends CharSequence> lVar) throws IOException {
        CharSequence charSequenceValueOf;
        if (lVar == null) {
            if (!(t10 == 0 ? true : t10 instanceof CharSequence)) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf((Object) t10);
            }
            appendable.append(charSequenceValueOf);
        }
        t10 = (T) lVar.invoke(t10);
        charSequenceValueOf = (CharSequence) t10;
        appendable.append(charSequenceValueOf);
    }
}
