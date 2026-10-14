package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import x1.i;
import x1.r;
import x1.v;
import x1.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f3097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f3098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f3099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x1.f f3100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3105k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f3106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w f3107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f3108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Executor f3109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r f3110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public x1.f f3111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f3112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3114i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3115j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3116k;

        public a() {
            this.f3113h = 4;
            this.f3114i = 0;
            this.f3115j = Integer.MAX_VALUE;
            this.f3116k = 20;
        }

        public a(b bVar) {
            this.f3106a = bVar.f3095a;
            this.f3107b = bVar.f3097c;
            this.f3108c = bVar.f3098d;
            this.f3109d = bVar.f3096b;
            this.f3113h = bVar.f3102h;
            this.f3114i = bVar.f3103i;
            this.f3115j = bVar.f3104j;
            this.f3116k = bVar.f3105k;
            this.f3110e = bVar.f3099e;
            this.f3111f = bVar.f3100f;
            this.f3112g = bVar.f3101g;
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public interface InterfaceC0047b {
        b a();
    }

    public b(a aVar) {
        Executor executor = aVar.f3106a;
        this.f3095a = executor == null ? a(false) : executor;
        Executor executor2 = aVar.f3109d;
        this.f3096b = executor2 == null ? a(true) : executor2;
        w vVar = aVar.f3107b;
        if (vVar == null) {
            String str = w.f37421a;
            vVar = new v();
        }
        this.f3097c = vVar;
        i iVar = aVar.f3108c;
        this.f3098d = iVar == null ? new x1.h() : iVar;
        r rVar = aVar.f3110e;
        this.f3099e = rVar == null ? new y1.a() : rVar;
        this.f3102h = aVar.f3113h;
        this.f3103i = aVar.f3114i;
        this.f3104j = aVar.f3115j;
        this.f3105k = aVar.f3116k;
        this.f3100f = aVar.f3111f;
        this.f3101g = aVar.f3112g;
    }

    public final Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new x1.a(this, z10));
    }
}
