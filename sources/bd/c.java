package bd;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends bd.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3522g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f3523h = new c(1, 0);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean e(int i10) {
        return this.f3515c <= i10 && i10 <= this.f3516d;
    }

    @Override // bd.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3515c != cVar.f3515c || this.f3516d != cVar.f3516d) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // bd.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3515c * 31) + this.f3516d;
    }

    @Override // bd.a
    public boolean isEmpty() {
        return this.f3515c > this.f3516d;
    }

    @Override // bd.a
    public String toString() {
        return this.f3515c + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f3516d;
    }
}
