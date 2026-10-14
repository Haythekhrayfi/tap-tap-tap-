package com.yandex.metrica.impl.ob;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f15602b;

    public static class a {
    }

    public static class b {
    }

    public Yl() {
        this(new b(), new a());
    }

    public Yl(b bVar, a aVar) {
        this.f15601a = bVar;
        this.f15602b = aVar;
    }

    public Gl a(Activity activity, InterfaceC1715il interfaceC1715il, C1542bm c1542bm, C1541bl c1541bl, C1592dm c1592dm, Xl xl) {
        ViewGroup viewGroup;
        Gl gl = new Gl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        } catch (Throwable th) {
            c1592dm.a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            Objects.requireNonNull(this.f15601a);
            C1989tl c1989tl = new C1989tl(c1542bm, new C1766km(c1592dm), new Tk(c1542bm.f15848c), c1541bl, Collections.singletonList(new C1865ol()), Arrays.asList(new Dl(c1542bm.f15847b)), c1592dm, xl, new C1816mm());
            gl.a(c1989tl, viewGroup, interfaceC1715il);
            if (c1542bm.f15850e) {
                Objects.requireNonNull(this.f15602b);
                Sk sk = new Sk(c1989tl.a());
                Iterator<El> it = c1989tl.b().iterator();
                while (it.hasNext()) {
                    sk.a(it.next());
                }
            }
        }
        return gl;
    }
}
