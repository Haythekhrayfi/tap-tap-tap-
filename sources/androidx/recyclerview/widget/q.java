package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.f f2781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2783e;

    public q(p pVar, p.f fVar, int i10) {
        this.f2783e = pVar;
        this.f2781c = fVar;
        this.f2782d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f2783e.f2748r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        p.f fVar = this.f2781c;
        if (fVar.f2777k || fVar.f2771e.getAdapterPosition() == -1) {
            return;
        }
        RecyclerView.l itemAnimator = this.f2783e.f2748r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.l()) {
            p pVar = this.f2783e;
            int size = pVar.f2746p.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (!pVar.f2746p.get(i10).f2778l) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f2783e.f2743m.j(this.f2781c.f2771e, this.f2782d);
                return;
            }
        }
        this.f2783e.f2748r.post(this);
    }
}
