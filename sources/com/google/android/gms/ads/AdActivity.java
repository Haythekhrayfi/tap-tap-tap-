package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbrt zza;

    private final void zza() {
        zzbrt zzbrtVar = this.zza;
        if (zzbrtVar != null) {
            try {
                zzbrtVar.zzx();
            } catch (RemoteException e10) {
                zzbzr.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null && !zzbrtVar.zzG()) {
                return;
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbrt zzbrtVar2 = this.zza;
            if (zzbrtVar2 != null) {
                zzbrtVar2.zzi();
            }
        } catch (RemoteException e11) {
            zzbzr.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbrt zzbrtVarZzo = zzay.zza().zzo(this);
        this.zza = zzbrtVarZzo;
        if (zzbrtVarZzo != null) {
            try {
                zzbrtVarZzo.zzl(bundle);
                return;
            } catch (RemoteException e10) {
                e = e10;
            }
        } else {
            e = null;
        }
        zzbzr.zzl("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzm();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzo();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzq();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzr();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzs(bundle);
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzt();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzu();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzv();
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
