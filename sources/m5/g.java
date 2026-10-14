package m5;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import f5.d0;
import f5.n0;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f33207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f33208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f33209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f33210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f33211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f33212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<d> f33213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<d>> f33214i;

    public g(Context context, k kVar, n0 n0Var, h hVar, a aVar, c cVar, d0 d0Var) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f33213h = atomicReference;
        this.f33214i = new AtomicReference<>(new TaskCompletionSource());
        this.f33206a = context;
        this.f33207b = kVar;
        this.f33209d = n0Var;
        this.f33208c = hVar;
        this.f33210e = aVar;
        this.f33211f = cVar;
        this.f33212g = d0Var;
        atomicReference.set(b.b(n0Var));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:45:0x005e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final m5.d a(m5.e r9) {
        /*
            r8 = this;
            r0 = 6
            r1 = 0
            m5.e r2 = m5.e.SKIP_CACHE_LOOKUP     // Catch: java.lang.Exception -> La4
            boolean r2 = r2.equals(r9)     // Catch: java.lang.Exception -> La2
            if (r2 != 0) goto Lb4
            m5.a r2 = r8.f33210e     // Catch: java.lang.Exception -> La0
            org.json.JSONObject r2 = r2.a()     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L90
            m5.h r3 = r8.f33208c     // Catch: java.lang.Exception -> L8e
            m5.d r3 = r3.a(r2)     // Catch: java.lang.Exception -> L8c
            if (r3 == 0) goto L72
            java.lang.String r4 = "Loaded cached settings: "
            r8.c(r2, r4)     // Catch: java.lang.Exception -> L6e
            f5.n0 r2 = r8.f33209d     // Catch: java.lang.Exception -> L6c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L6a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L68
            m5.e r2 = m5.e.IGNORE_CACHE_EXPIRATION     // Catch: java.lang.Exception -> L66
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Exception -> L64
            if (r9 != 0) goto L51
            long r6 = r3.f33197c     // Catch: java.lang.Exception -> L4e
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L38
            r9 = 1
            goto L39
        L38:
            r9 = 0
        L39:
            if (r9 != 0) goto L3c
            goto L51
        L3c:
            c5.d r9 = c5.d.f3604c     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = "Cached settings have expired."
            r9.e(r2)     // Catch: java.lang.Exception -> L45
            goto Lb4
        L45:
            r9 = move-exception
            goto La5
        L48:
            r9 = move-exception
            goto La5
        L4b:
            r9 = move-exception
            goto La5
        L4e:
            r9 = move-exception
            goto La5
        L51:
            c5.d r9 = c5.d.f3604c     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = "Returning cached settings."
            r9.e(r1)     // Catch: java.lang.Exception -> L5b
            r1 = r3
            goto Lb4
        L5b:
            r9 = move-exception
            r1 = r3
            goto La5
        L5e:
            r9 = move-exception
            r1 = r3
            goto La5
        L61:
            r9 = move-exception
            r1 = r3
            goto La5
        L64:
            r9 = move-exception
            goto La5
        L66:
            r9 = move-exception
            goto La5
        L68:
            r9 = move-exception
            goto La5
        L6a:
            r9 = move-exception
            goto La5
        L6c:
            r9 = move-exception
            goto La5
        L6e:
            r9 = move-exception
            goto La5
        L70:
            r9 = move-exception
            goto La5
        L72:
            c5.d r9 = c5.d.f3604c     // Catch: java.lang.Exception -> L8a
            java.lang.String r2 = "Failed to parse cached settings data."
            boolean r3 = r9.a(r0)     // Catch: java.lang.Exception -> L86
            if (r3 == 0) goto Lb4
            java.lang.String r9 = r9.f3605a     // Catch: java.lang.Exception -> L84
            android.util.Log.e(r9, r2, r1)     // Catch: java.lang.Exception -> L82
            goto Lb4
        L82:
            r9 = move-exception
            goto La5
        L84:
            r9 = move-exception
            goto La5
        L86:
            r9 = move-exception
            goto La5
        L88:
            r9 = move-exception
            goto La5
        L8a:
            r9 = move-exception
            goto La5
        L8c:
            r9 = move-exception
            goto La5
        L8e:
            r9 = move-exception
            goto La5
        L90:
            c5.d r9 = c5.d.f3604c     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = "No cached settings data found."
            r9.b(r2)     // Catch: java.lang.Exception -> L98
            goto Lb4
        L98:
            r9 = move-exception
            goto La5
        L9a:
            r9 = move-exception
            goto La5
        L9c:
            r9 = move-exception
            goto La5
        L9e:
            r9 = move-exception
            goto La5
        La0:
            r9 = move-exception
            goto La5
        La2:
            r9 = move-exception
            goto La5
        La4:
            r9 = move-exception
        La5:
            c5.d r2 = c5.d.f3604c
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto Lb4
            java.lang.String r0 = r2.f3605a
            java.lang.String r2 = "Failed to get cached settings"
            android.util.Log.e(r0, r2, r9)
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.g.a(m5.e):m5.d");
    }

    public d b() {
        return this.f33213h.get();
    }

    public final void c(JSONObject jSONObject, String str) throws JSONException {
        c5.d dVar = c5.d.f3604c;
        StringBuilder sbA = defpackage.a.a(str);
        sbA.append(jSONObject.toString());
        dVar.b(sbA.toString());
    }
}
