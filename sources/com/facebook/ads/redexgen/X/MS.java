package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MS implements View.OnClickListener {
    public static String[] A01 = {"RpRdDeRKSCMdi", "IuXxM6erDWGrR2ilBdYngNq10nVc0mkU", "Kill7HMysw6SnDOrBs", "MIbB774K8liBHgb3cyiNiqUG4b3Um782", "7YEQDQbB6rycAAMyAlOvxfyaq0dnUo7P", "y1fFSWKNdNdnYTXNNG", "pYfR2zdeniJKCCLkUpT", "pJHaP"};
    public final /* synthetic */ TC A00;

    public MS(TC tc2) {
        this.A00 = tc2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A98();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A01[5].length() == 17) {
                throw new RuntimeException();
            }
            A01[5] = "tK5zLur";
        }
    }
}
