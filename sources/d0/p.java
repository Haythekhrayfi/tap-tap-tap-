package d0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f28538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f28539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0[] f28540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0[] f28541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f28545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public int f28546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f28547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PendingIntent f28548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28549l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconCompat f28550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f28551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PendingIntent f28552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f28554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<f0> f28555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f28557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f28558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f28559j;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f28553d = true;
            this.f28557h = true;
            this.f28550a = iconCompat;
            this.f28551b = t.c(charSequence);
            this.f28552c = pendingIntent;
            this.f28554e = bundle;
            this.f28555f = f0VarArr == null ? null : new ArrayList<>(Arrays.asList(f0VarArr));
            this.f28553d = z10;
            this.f28556g = i10;
            this.f28557h = z11;
            this.f28558i = z12;
            this.f28559j = z13;
        }

        public a(p pVar) {
            this(pVar.a(), pVar.f28547j, pVar.f28548k, new Bundle(pVar.f28538a), pVar.f28540c, pVar.f28542e, pVar.f28544g, pVar.f28543f, pVar.f28545h, pVar.f28549l);
        }
    }

    public p(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent);
    }

    public p(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }

    public p(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, f0[] f0VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f28543f = true;
        this.f28539b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f28546i = iconCompat.f();
        }
        this.f28547j = t.c(charSequence);
        this.f28548k = pendingIntent;
        this.f28538a = bundle == null ? new Bundle() : bundle;
        this.f28540c = f0VarArr;
        this.f28541d = f0VarArr2;
        this.f28542e = z10;
        this.f28544g = i10;
        this.f28543f = z11;
        this.f28545h = z12;
        this.f28549l = z13;
    }

    public IconCompat a() {
        int i10;
        if (this.f28539b == null && (i10 = this.f28546i) != 0) {
            this.f28539b = IconCompat.d(null, "", i10);
        }
        return this.f28539b;
    }
}
