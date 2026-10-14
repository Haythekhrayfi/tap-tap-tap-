package bc;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3504d;

    public a(int i10) {
        this.f3501a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f3502b = objArr;
        this.f3503c = objArr;
    }

    public void a(T t10) {
        int i10 = this.f3501a;
        int i11 = this.f3504d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f3503c[i10] = objArr;
            this.f3503c = objArr;
            i11 = 0;
        }
        this.f3503c[i11] = t10;
        this.f3504d = i11 + 1;
    }

    public void b(T t10) {
        this.f3502b[0] = t10;
    }
}
