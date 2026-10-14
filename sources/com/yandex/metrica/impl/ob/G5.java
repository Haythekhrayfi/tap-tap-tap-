package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class G5 extends AbstractC1948s5 {
    public G5(C1624f4 c1624f4) {
        super(c1624f4);
    }

    private void a(C1744k0 c1744k0, Qm qm) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", qm.toString());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        c1744k0.f(string);
        a().r().b(c1744k0);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        Qm qm;
        String strO = c1744k0.o();
        com.yandex.metrica.i iVarA = C1694i.a(strO);
        String strH = a().h();
        com.yandex.metrica.i iVarA2 = C1694i.a(strH);
        if (!iVarA.equals(iVarA2)) {
            boolean z10 = false;
            if (TextUtils.isEmpty(iVarA.f13583a) && !TextUtils.isEmpty(iVarA2.f13583a)) {
                c1744k0.e(strH);
                qm = Qm.LOGOUT;
            } else {
                if (!TextUtils.isEmpty(iVarA.f13583a) && TextUtils.isEmpty(iVarA2.f13583a)) {
                    qm = Qm.LOGIN;
                } else {
                    if (!TextUtils.isEmpty(iVarA.f13583a) && !iVarA.f13583a.equals(iVarA2.f13583a)) {
                        z10 = true;
                    }
                    qm = z10 ? Qm.SWITCH : Qm.UPDATE;
                }
            }
            a(c1744k0, qm);
            a().a(strO);
        }
        return true;
    }
}
