package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
final class cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12053a = new com.google.android.play.core.internal.af("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bb f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f12055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bz f12056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f12057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, cm> f12058f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReentrantLock f12059g = new ReentrantLock();

    public cp(bb bbVar, com.google.android.play.core.internal.cj<w> cjVar, bz bzVar, com.google.android.play.core.internal.cj<Executor> cjVar2) {
        this.f12054b = bbVar;
        this.f12055c = cjVar;
        this.f12056d = bzVar;
        this.f12057e = cjVar2;
    }

    private final <T> T a(co<T> coVar) {
        try {
            a();
            return coVar.a();
        } finally {
            b();
        }
    }

    private final Map<String, cm> d(final List<String> list) {
        return (Map) a(new co(this, list) { // from class: com.google.android.play.core.assetpacks.cf

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f12029b;

            {
                this.f12028a = this;
                this.f12029b = list;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                return this.f12028a.c(this.f12029b);
            }
        });
    }

    private final cm e(int i10) {
        Map<Integer, cm> map = this.f12058f;
        Integer numValueOf = Integer.valueOf(i10);
        cm cmVar = map.get(numValueOf);
        if (cmVar != null) {
            return cmVar;
        }
        throw new bv(String.format("Could not find session %d while trying to get it", numValueOf), i10);
    }

    private static String e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new bv("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static <T> List<T> e(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Integer> a(final List<String> list) {
        return (Map) a(new co(this, list) { // from class: com.google.android.play.core.assetpacks.ci

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f12035b;

            {
                this.f12034a = this;
                this.f12035b = list;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                return this.f12034a.b(this.f12035b);
            }
        });
    }

    public final void a() {
        this.f12059g.lock();
    }

    public final void a(final int i10) {
        a(new co(this, i10) { // from class: com.google.android.play.core.assetpacks.ch

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f12033b;

            {
                this.f12032a = this;
                this.f12033b = i10;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                this.f12032a.c(this.f12033b);
                return null;
            }
        });
    }

    public final void a(final String str, final int i10, final long j10) {
        a(new co(this, str, i10, j10) { // from class: com.google.android.play.core.assetpacks.ce

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f12025b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f12026c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final long f12027d;

            {
                this.f12024a = this;
                this.f12025b = str;
                this.f12026c = i10;
                this.f12027d = j10;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                this.f12024a.b(this.f12025b, this.f12026c, this.f12027d);
                return null;
            }
        });
    }

    public final boolean a(final Bundle bundle) {
        return ((Boolean) a(new co(this, bundle) { // from class: com.google.android.play.core.assetpacks.cc

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12020a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Bundle f12021b;

            {
                this.f12020a = this;
                this.f12021b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                return this.f12020a.d(this.f12021b);
            }
        })).booleanValue();
    }

    public final /* synthetic */ Map b(List list) {
        int i10;
        Map<String, cm> mapD = d((List<String>) list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final cm cmVar = mapD.get(str);
            if (cmVar == null) {
                i10 = 8;
            } else {
                if (db.a(cmVar.f12046c.f12041c)) {
                    try {
                        cmVar.f12046c.f12041c = 6;
                        this.f12057e.a().execute(new Runnable(this, cmVar) { // from class: com.google.android.play.core.assetpacks.cj

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private final cp f12036a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private final cm f12037b;

                            {
                                this.f12036a = this;
                                this.f12037b = cmVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f12036a.a(this.f12037b.f12044a);
                            }
                        });
                        this.f12056d.a(str);
                    } catch (bv unused) {
                        f12053a.c("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(cmVar.f12044a), str);
                    }
                }
                i10 = cmVar.f12046c.f12041c;
            }
            map.put(str, Integer.valueOf(i10));
        }
        return map;
    }

    public final void b() {
        this.f12059g.unlock();
    }

    public final /* synthetic */ void b(int i10) {
        e(i10).f12046c.f12041c = 5;
    }

    public final /* synthetic */ void b(String str, int i10, long j10) {
        cm cmVar = d(Arrays.asList(str)).get(str);
        if (cmVar == null || db.b(cmVar.f12046c.f12041c)) {
            f12053a.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f12054b.f(str, i10, j10);
        cmVar.f12046c.f12041c = 4;
    }

    public final boolean b(final Bundle bundle) {
        return ((Boolean) a(new co(this, bundle) { // from class: com.google.android.play.core.assetpacks.cd

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Bundle f12023b;

            {
                this.f12022a = this;
                this.f12023b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                return this.f12022a.c(this.f12023b);
            }
        })).booleanValue();
    }

    public final /* synthetic */ Boolean c(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, cm> map = this.f12058f;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        cm cmVar = this.f12058f.get(numValueOf);
        if (cmVar.f12046c.f12041c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!db.a(cmVar.f12046c.f12041c, bundle.getInt(com.google.android.play.core.internal.h.a("status", e(bundle)))));
    }

    public final Map<Integer, cm> c() {
        return this.f12058f;
    }

    public final /* synthetic */ Map c(List list) {
        HashMap map = new HashMap();
        for (cm cmVar : this.f12058f.values()) {
            String str = cmVar.f12046c.f12039a;
            if (list.contains(str)) {
                cm cmVar2 = (cm) map.get(str);
                if ((cmVar2 == null ? -1 : cmVar2.f12044a) < cmVar.f12044a) {
                    map.put(str, cmVar);
                }
            }
        }
        return map;
    }

    public final /* synthetic */ void c(int i10) {
        cm cmVarE = e(i10);
        if (!db.b(cmVarE.f12046c.f12041c)) {
            throw new bv(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
        }
        bb bbVar = this.f12054b;
        cl clVar = cmVarE.f12046c;
        bbVar.f(clVar.f12039a, cmVarE.f12045b, clVar.f12040b);
        cl clVar2 = cmVarE.f12046c;
        int i11 = clVar2.f12041c;
        if (i11 == 5 || i11 == 6) {
            this.f12054b.d(clVar2.f12039a);
        }
    }

    public final /* synthetic */ Boolean d(Bundle bundle) {
        cn cnVar;
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, cm> map = this.f12058f;
        Integer numValueOf = Integer.valueOf(i10);
        boolean z10 = false;
        if (map.containsKey(numValueOf)) {
            cm cmVarE = e(i10);
            int i11 = bundle.getInt(com.google.android.play.core.internal.h.a("status", cmVarE.f12046c.f12039a));
            if (db.a(cmVarE.f12046c.f12041c, i11)) {
                f12053a.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(cmVarE.f12046c.f12041c));
                cl clVar = cmVarE.f12046c;
                String str = clVar.f12039a;
                int i12 = clVar.f12041c;
                if (i12 == 4) {
                    this.f12055c.a().a(i10, str);
                } else if (i12 == 5) {
                    this.f12055c.a().a(i10);
                } else if (i12 == 6) {
                    this.f12055c.a().a(Arrays.asList(str));
                }
            } else {
                cmVarE.f12046c.f12041c = i11;
                if (db.b(i11)) {
                    a(i10);
                    this.f12056d.a(cmVarE.f12046c.f12039a);
                } else {
                    List<cn> list = cmVarE.f12046c.f12043e;
                    int size = list.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        cn cnVar2 = list.get(i13);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.play.core.internal.h.a("chunk_intents", cmVarE.f12046c.f12039a, cnVar2.f12047a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    cnVar2.f12050d.get(i14).f12038a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strE = e(bundle);
            long j10 = bundle.getLong(com.google.android.play.core.internal.h.a("pack_version", strE));
            int i15 = bundle.getInt(com.google.android.play.core.internal.h.a("status", strE));
            long j11 = bundle.getLong(com.google.android.play.core.internal.h.a("total_bytes_to_download", strE));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(com.google.android.play.core.internal.h.a("slice_ids", strE));
            ArrayList arrayList = new ArrayList();
            Iterator it = e(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(com.google.android.play.core.internal.h.a("chunk_intents", strE, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = e(parcelableArrayList2).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it;
                    if (((Intent) it2.next()) != null) {
                        z10 = true;
                    }
                    arrayList2.add(new ck(z10));
                    it = it3;
                    z10 = false;
                }
                Iterator it4 = it;
                String string = bundle.getString(com.google.android.play.core.internal.h.a("uncompressed_hash_sha256", strE, str2));
                long j12 = bundle.getLong(com.google.android.play.core.internal.h.a("uncompressed_size", strE, str2));
                int i16 = bundle.getInt(com.google.android.play.core.internal.h.a("patch_format", strE, str2), 0);
                if (i16 != 0) {
                    cnVar = new cn(str2, string, j12, arrayList2, 0, i16);
                    z10 = false;
                } else {
                    z10 = false;
                    cnVar = new cn(str2, string, j12, arrayList2, bundle.getInt(com.google.android.play.core.internal.h.a("compression_format", strE, str2), 0), 0);
                }
                arrayList.add(cnVar);
                it = it4;
            }
            this.f12058f.put(Integer.valueOf(i10), new cm(i10, bundle.getInt("app_version_code"), new cl(strE, j10, i15, j11, arrayList)));
        }
        return Boolean.TRUE;
    }

    public final void d(final int i10) {
        a(new co(this, i10) { // from class: com.google.android.play.core.assetpacks.cg

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cp f12030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f12031b;

            {
                this.f12030a = this;
                this.f12031b = i10;
            }

            @Override // com.google.android.play.core.assetpacks.co
            public final Object a() {
                this.f12030a.b(this.f12031b);
                return null;
            }
        });
    }
}
