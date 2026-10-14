package bd;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable<Integer>, wc.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0063a f3514f = new C0063a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3517e;

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    public static final class C0063a {
        public C0063a() {
        }

        public C0063a(g gVar) {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3515c = i10;
        this.f3516d = c0.l(i10, i11, i12);
        this.f3517e = i12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kc.c0 iterator() {
        return new b(this.f3515c, this.f3516d, this.f3517e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f3515c != aVar.f3515c || this.f3516d != aVar.f3516d || this.f3517e != aVar.f3517e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3515c * 31) + this.f3516d) * 31) + this.f3517e;
    }

    public boolean isEmpty() {
        if (this.f3517e > 0) {
            if (this.f3515c > this.f3516d) {
                return true;
            }
        } else if (this.f3515c < this.f3516d) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f3517e > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f3515c);
            sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb2.append(this.f3516d);
            sb2.append(" step ");
            i10 = this.f3517e;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f3515c);
            sb2.append(" downTo ");
            sb2.append(this.f3516d);
            sb2.append(" step ");
            i10 = -this.f3517e;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
