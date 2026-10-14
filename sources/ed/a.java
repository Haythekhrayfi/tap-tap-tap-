package ed;

import androidx.appcompat.widget.r0;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static final int a(int i10) {
        if (new bd.c(2, 36).e(i10)) {
            return i10;
        }
        StringBuilder sbA = r0.a("radix ", i10, " was not in valid range ");
        sbA.append(new bd.c(2, 36));
        throw new IllegalArgumentException(sbA.toString());
    }

    public static final boolean b(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
