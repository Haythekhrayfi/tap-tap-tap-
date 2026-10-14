package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1302a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1303b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1304c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1305d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1306e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1307f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1308g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1309h = false;

    public void a(int i10, int i11) {
        this.f1304c = i10;
        this.f1305d = i11;
        this.f1309h = true;
        if (this.f1308g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1302a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1303b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1302a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1303b = i11;
        }
    }
}
