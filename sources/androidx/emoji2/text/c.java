package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f1771a;

        public a(b bVar) {
            this.f1771a = bVar == null ? Build.VERSION.SDK_INT >= 28 ? new d() : new C0031c() : bVar;
        }
    }

    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C0031c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    public static class d extends C0031c {
        @Override // androidx.emoji2.text.c.b
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static k a(Context context) {
        ProviderInfo providerInfoA;
        m0.f fVar;
        boolean z10;
        ApplicationInfo applicationInfo;
        a aVar = new a(null);
        PackageManager packageManager = context.getPackageManager();
        androidx.activity.i.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = aVar.f1771a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            if (!it.hasNext()) {
                providerInfoA = null;
                break;
            }
            providerInfoA = aVar.f1771a.a(it.next());
            z10 = true;
            if (providerInfoA == null || (applicationInfo = providerInfoA.applicationInfo) == null || (applicationInfo.flags & 1) != 1) {
                z10 = false;
            }
        } while (!z10);
        if (providerInfoA == null) {
            fVar = null;
        } else {
            try {
                String str = providerInfoA.authority;
                String str2 = providerInfoA.packageName;
                Signature[] signatureArrB = aVar.f1771a.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                fVar = new m0.f(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                fVar = null;
            }
        }
        if (fVar == null) {
            return null;
        }
        return new k(context, fVar);
    }
}
