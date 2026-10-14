package d0;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f28506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f28507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f28510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f28511g;

    public static class a {
        public static void a(f0 f0Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(f0.a(f0Var), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    public static class b {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28512a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f28515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f28516e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<String> f28513b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f28514c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28517f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28518g = 0;

        public c(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f28512a = str;
        }
    }

    public f0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f28505a = str;
        this.f28506b = charSequence;
        this.f28507c = charSequenceArr;
        this.f28508d = z10;
        this.f28509e = i10;
        this.f28510f = bundle;
        this.f28511g = set;
        if (i10 == 2 && !z10) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(f0 f0Var) {
        Set<String> set;
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(f0Var.f28505a).setLabel(f0Var.f28506b).setChoices(f0Var.f28507c).setAllowFreeFormInput(f0Var.f28508d).addExtras(f0Var.f28510f);
        if (Build.VERSION.SDK_INT >= 26 && (set = f0Var.f28511g) != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                a.d(builderAddExtras, it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(builderAddExtras, f0Var.f28509e);
        }
        return builderAddExtras.build();
    }
}
