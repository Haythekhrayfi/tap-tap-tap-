package androidx.viewpager2.widget;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Comparator<int[]> {
    public a(b bVar) {
    }

    @Override // java.util.Comparator
    public int compare(int[] iArr, int[] iArr2) {
        return iArr[0] - iArr2[0];
    }
}
