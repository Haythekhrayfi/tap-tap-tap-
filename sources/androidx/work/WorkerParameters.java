package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x1.p;
import x1.w;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f3082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f3083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f3084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f3087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2.a f3088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f3089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f3090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x1.e f3091j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3092a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f3093b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f3094c;
    }

    public WorkerParameters(UUID uuid, c cVar, Collection<String> collection, a aVar, int i10, Executor executor, j2.a aVar2, w wVar, p pVar, x1.e eVar) {
        this.f3082a = uuid;
        this.f3083b = cVar;
        this.f3084c = new HashSet(collection);
        this.f3085d = aVar;
        this.f3086e = i10;
        this.f3087f = executor;
        this.f3088g = aVar2;
        this.f3089h = wVar;
        this.f3090i = pVar;
        this.f3091j = eVar;
    }
}
