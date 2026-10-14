package l8;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o1 implements p7.n0.a, UserMessagingPlatform.OnConsentFormLoadSuccessListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32668g;

    public /* synthetic */ o1(View view, p1 p1Var, ViewGroup viewGroup, y9.i1 i1Var, i8.k kVar) {
        this.f32664c = view;
        this.f32665d = p1Var;
        this.f32666e = viewGroup;
        this.f32667f = i1Var;
        this.f32668g = kVar;
    }

    public /* synthetic */ o1(ConsentInformation consentInformation, com.zipoapps.ads.c cVar, com.zipoapps.ads.c.e eVar, uc.a aVar, uc.a aVar2) {
        this.f32664c = consentInformation;
        this.f32665d = cVar;
        this.f32666e = eVar;
        this.f32667f = aVar;
        this.f32668g = aVar2;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ConsentInformation consentInformation = (ConsentInformation) this.f32664c;
        com.zipoapps.ads.c cVar = (com.zipoapps.ads.c) this.f32665d;
        com.zipoapps.ads.c.e eVar = (com.zipoapps.ads.c.e) this.f32666e;
        uc.a aVar = (uc.a) this.f32667f;
        uc.a aVar2 = (uc.a) this.f32668g;
        String str = com.zipoapps.ads.c.f28151h;
        fd.j0.i(consentInformation, "$it");
        fd.j0.i(cVar, "this$0");
        fd.j0.i(eVar, "$consentStatus");
        if (consentInformation.getConsentStatus() == 2) {
            cVar.f28154c = consentForm;
            cVar.f(eVar);
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            xe.a.b(com.zipoapps.ads.c.f28151h).a("loadForm()-> Consent form is not required", new Object[0]);
            cVar.f28154c = consentForm;
            cVar.f(eVar);
            cVar.d();
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        cVar.f28157f = false;
    }
}
