package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzu f3833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f3834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3835g;

    public static final class b {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3842c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3843d = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f3844a;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f3837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.a f3839d;

        public a() {
            c.a aVar = new c.a();
            aVar.f3844a = true;
            this.f3839d = aVar;
        }

        public m a() {
            ArrayList arrayList = this.f3837b;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            if (!z10) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (!z10) {
                throw null;
            }
            if (this.f3837b.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (this.f3837b.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) this.f3837b.get(0);
                String strF = skuDetails.f();
                ArrayList arrayList2 = this.f3837b;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i10);
                    if (!strF.equals("play_pass_subs") && !skuDetails2.f().equals("play_pass_subs") && !strF.equals(skuDetails2.f())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strG = skuDetails.g();
                ArrayList arrayList3 = this.f3837b;
                int size2 = arrayList3.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i11);
                    if (!strF.equals("play_pass_subs") && !skuDetails3.f().equals("play_pass_subs") && !strG.equals(skuDetails3.g())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            m mVar = new m();
            mVar.f3829a = z10 && !((SkuDetails) this.f3837b.get(0)).g().isEmpty();
            mVar.f3830b = this.f3836a;
            mVar.f3831c = null;
            c.a aVar = this.f3839d;
            Objects.requireNonNull(aVar);
            boolean z11 = (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) ? false : true;
            boolean zIsEmpty = true ^ TextUtils.isEmpty(null);
            if (z11 && zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!aVar.f3844a && !z11 && !zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            c cVar = new c();
            cVar.f3840a = null;
            cVar.f3842c = 0;
            cVar.f3843d = 0;
            cVar.f3841b = null;
            mVar.f3832d = cVar;
            ArrayList arrayList4 = this.f3837b;
            mVar.f3834f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            mVar.f3835g = this.f3838c;
            mVar.f3833e = zzu.zzk();
            return mVar;
        }

        public a(u1.a aVar) {
            c.a aVar2 = new c.a();
            aVar2.f3844a = true;
            this.f3839d = aVar2;
        }
    }
}
