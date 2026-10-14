package x2;

import java.text.DateFormatSymbols;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateFormatSymbols f37424a = DateFormatSymbols.getInstance();

    public final String a(String[] strArr) {
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                iMin = Math.min(iMin, length);
                iMax = Math.max(iMax, length);
            }
        }
        int[] iArr = {iMin, iMax};
        StringBuilder sbA = defpackage.a.a(".{");
        sbA.append(iArr[0]);
        sbA.append(",");
        return android.support.v4.media.b.a(sbA, iArr[1], "}");
    }
}
