package l8;

import android.text.Editable;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements w7.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc.a0<g8.a> f32446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8.h f32447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.l<String, jc.w> f32448c;

    public static final class a extends vc.l implements uc.l<Editable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.a0<g8.a> f32449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.l<String, jc.w> f32450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o8.h f32451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.l<String, jc.w> f32452f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vc.a0<g8.a> a0Var, uc.l<? super String, jc.w> lVar, o8.h hVar, uc.l<? super String, jc.w> lVar2) {
            super(1);
            this.f32449c = a0Var;
            this.f32450d = lVar;
            this.f32451e = hVar;
            this.f32452f = lVar2;
        }

        @Override // uc.l
        public jc.w invoke(Editable editable) {
            String strP;
            String string;
            Editable editable2 = editable;
            String str = "";
            if (editable2 == null || (strP = editable2.toString()) == null) {
                strP = "";
            }
            g8.a aVar = this.f32449c.f36988c;
            if (aVar != null) {
                o8.h hVar = this.f32451e;
                uc.l<String, jc.w> lVar = this.f32452f;
                if (!fd.j0.d(aVar.i(), strP)) {
                    Editable text = hVar.getText();
                    if (text != null && (string = text.toString()) != null) {
                        str = string;
                    }
                    aVar.a(str, Integer.valueOf(hVar.getSelectionStart()));
                    hVar.setText(aVar.i());
                    hVar.setSelection(aVar.f30031d);
                    lVar.invoke(aVar.i());
                }
            }
            g8.a aVar2 = this.f32449c.f36988c;
            if (aVar2 != null) {
                strP = ed.q.p(aVar2.h(), CoreConstants.COMMA_CHAR, CoreConstants.DOT, false, 4);
            }
            this.f32450d.invoke(strP);
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3(vc.a0<g8.a> a0Var, o8.h hVar, uc.l<? super String, jc.w> lVar) {
        this.f32446a = a0Var;
        this.f32447b = hVar;
        this.f32448c = lVar;
    }

    @Override // w7.f.a
    public void a(Object obj) {
        String strI = (String) obj;
        g8.a aVar = this.f32446a.f36988c;
        if (aVar != null) {
            uc.l<String, jc.w> lVar = this.f32448c;
            if (strI == null) {
                strI = "";
            }
            aVar.k(strI);
            lVar.invoke(aVar.i());
            strI = aVar.i();
        }
        this.f32447b.setText(strI);
    }

    @Override // w7.f.a
    public void b(uc.l<? super String, jc.w> lVar) {
        o8.h hVar = this.f32447b;
        hVar.setBoundVariableChangeAction(new a(this.f32446a, lVar, hVar, this.f32448c));
    }
}
