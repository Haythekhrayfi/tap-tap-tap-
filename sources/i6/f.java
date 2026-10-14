package i6;

/* JADX INFO: loaded from: classes2.dex */
public class f implements h6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31292b;

    public f(String str, int i10) {
        this.f31291a = str;
        this.f31292b = i10;
    }

    @Override // h6.g
    public int b() {
        return this.f31292b;
    }

    @Override // h6.g
    public String c() {
        if (this.f31292b == 0) {
            return "";
        }
        String str = this.f31291a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}
