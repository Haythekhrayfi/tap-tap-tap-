package x1;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f37414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.p f37415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f37416c;

    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g2.p f37419c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37417a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<String> f37420d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f37418b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f37419c = new g2.p(this.f37418b.toString(), cls.getName());
            this.f37420d.add(cls.getName());
        }

        public final W a() {
            n.a aVar = (n.a) this;
            if (aVar.f37417a && aVar.f37419c.f29749j.f37382c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            n nVar = new n(aVar);
            b bVar = this.f37419c.f29749j;
            boolean z10 = bVar.a() || bVar.f37383d || bVar.f37381b || bVar.f37382c;
            g2.p pVar = this.f37419c;
            if (pVar.f29756q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (pVar.f29746g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f37418b = UUID.randomUUID();
            g2.p pVar2 = new g2.p(this.f37419c);
            this.f37419c = pVar2;
            pVar2.f29740a = this.f37418b.toString();
            return nVar;
        }
    }

    public u(UUID uuid, g2.p pVar, Set<String> set) {
        this.f37414a = uuid;
        this.f37415b = pVar;
        this.f37416c = set;
    }

    public String a() {
        return this.f37414a.toString();
    }
}
