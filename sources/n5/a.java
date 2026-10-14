package n5;

/* JADX INFO: loaded from: classes2.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f33617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f33618c;

    public a(int i10, d... dVarArr) {
        this.f33616a = i10;
        this.f33617b = dVarArr;
        this.f33618c = new b(i10);
    }

    @Override // n5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f33616a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f33617b) {
            if (stackTraceElementArrA.length <= this.f33616a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f33616a ? this.f33618c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
