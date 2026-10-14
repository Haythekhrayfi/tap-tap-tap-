package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f37043d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37046g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f37040a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37041b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37042c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f37044e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37047h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f37048i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37049j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f37050k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<g> f37051l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public g(q qVar) {
        this.f37043d = qVar;
    }

    @Override // w.d
    public void a(d dVar) {
        Iterator<g> it = this.f37051l.iterator();
        while (it.hasNext()) {
            if (!it.next().f37049j) {
                return;
            }
        }
        this.f37042c = true;
        d dVar2 = this.f37040a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f37041b) {
            this.f37043d.a(this);
            return;
        }
        g gVar = null;
        int i10 = 0;
        for (g gVar2 : this.f37051l) {
            if (!(gVar2 instanceof h)) {
                i10++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i10 == 1 && gVar.f37049j) {
            h hVar = this.f37048i;
            if (hVar != null) {
                if (!hVar.f37049j) {
                    return;
                } else {
                    this.f37045f = this.f37047h * hVar.f37046g;
                }
            }
            c(gVar.f37046g + this.f37045f);
        }
        d dVar3 = this.f37040a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f37051l.clear();
        this.f37050k.clear();
        this.f37049j = false;
        this.f37046g = 0;
        this.f37042c = false;
        this.f37041b = false;
    }

    public void c(int i10) {
        if (this.f37049j) {
            return;
        }
        this.f37049j = true;
        this.f37046g = i10;
        for (d dVar : this.f37050k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37043d.f37071b.f36612s0);
        sb2.append(":");
        sb2.append(this.f37044e);
        sb2.append("(");
        sb2.append(this.f37049j ? Integer.valueOf(this.f37046g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f37051l.size());
        sb2.append(":d=");
        sb2.append(this.f37050k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
