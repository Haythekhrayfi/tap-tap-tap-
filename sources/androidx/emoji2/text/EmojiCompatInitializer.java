package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p1.b<Boolean> {

    public static class a extends e.c {
        public a(Context context) {
            super(new b(context));
            this.f1790b = 1;
        }
    }

    public static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1768a;

        public b(Context context) {
            this.f1768a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            ThreadPoolExecutor threadPoolExecutorA = androidx.emoji2.text.b.a("EmojiCompatInitializer");
            threadPoolExecutorA.execute(new f(this, hVar, threadPoolExecutorA));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i10 = l0.j.f32096a;
                l0.j.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.c()) {
                    e.a().e();
                }
            } finally {
                int i11 = l0.j.f32096a;
                l0.j.a.b();
            }
        }
    }

    public Boolean a(Context context) {
        Object objB;
        a aVar = new a(context);
        if (e.f1775k == null) {
            synchronized (e.f1774j) {
                if (e.f1775k == null) {
                    e.f1775k = new e(aVar);
                }
            }
        }
        p1.a aVarC = p1.a.c(context);
        Objects.requireNonNull(aVarC);
        synchronized (p1.a.f34447e) {
            objB = aVarC.f34448a.get(ProcessLifecycleInitializer.class);
            if (objB == null) {
                objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        final androidx.lifecycle.i lifecycle = ((androidx.lifecycle.p) objB).getLifecycle();
        lifecycle.a(new androidx.lifecycle.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.c, androidx.lifecycle.f
            public void a(androidx.lifecycle.p pVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                androidx.emoji2.text.b.b().postDelayed(new c(), 500L);
                lifecycle.c(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // p1.b
    public /* bridge */ /* synthetic */ Boolean create(Context context) {
        a(context);
        return Boolean.TRUE;
    }

    @Override // p1.b
    public List<Class<? extends p1.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
