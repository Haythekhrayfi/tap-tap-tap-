package h3;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // h3.a
    public int a() {
        return 4;
    }

    @Override // h3.a
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // h3.a
    public String e() {
        return "IntegerArrayPool";
    }

    @Override // h3.a
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
