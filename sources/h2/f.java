package h2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f30502a;

    public f(WorkDatabase workDatabase) {
        this.f30502a = workDatabase;
    }

    public final int a(String str) {
        this.f30502a.c();
        try {
            Long lA = ((g2.f) this.f30502a.r()).a(str);
            int i10 = 0;
            int iIntValue = lA != null ? lA.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i10 = iIntValue + 1;
            }
            ((g2.f) this.f30502a.r()).b(new g2.d(str, i10));
            this.f30502a.p();
            return iIntValue;
        } finally {
            this.f30502a.g();
        }
    }

    public int b(int i10, int i11) {
        synchronized (f.class) {
            int iA = a("next_job_scheduler_id");
            if (iA < i10 || iA > i11) {
                ((g2.f) this.f30502a.r()).b(new g2.d("next_job_scheduler_id", i10 + 1));
            } else {
                i10 = iA;
            }
        }
        return i10;
    }
}
