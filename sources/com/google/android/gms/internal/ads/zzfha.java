package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfha extends zzfgw {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfgy zzb;
    private final zzfgx zzc;
    private zzfiu zze;
    private zzfhx zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    public zzfha(zzfgx zzfgxVar, zzfgy zzfgyVar) {
        this.zzc = zzfgxVar;
        this.zzb = zzfgyVar;
        zzk(null);
        if (zzfgyVar.zzd() == zzfgz.HTML || zzfgyVar.zzd() == zzfgz.JAVASCRIPT) {
            this.zzf = new zzfhy(zzfgyVar.zza());
        } else {
            this.zzf = new zzfia(zzfgyVar.zzi(), null);
        }
        this.zzf.zzj();
        zzfhl.zza().zzd(this);
        zzfhq.zza().zzd(this.zzf.zza(), zzfgxVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfiu(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final void zzb(View view, zzfhc zzfhcVar, String str) {
        zzfhn zzfhnVar;
        if (this.zzh) {
            return;
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzd.iterator();
        do {
            if (!it.hasNext()) {
                zzfhnVar = null;
                break;
            }
            zzfhnVar = (zzfhn) it.next();
        } while (zzfhnVar.zzb().get() != view);
        if (zzfhnVar == null) {
            this.zzd.add(new zzfhn(view, zzfhcVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfhq.zza().zzc(this.zzf.zza());
        zzfhl.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfha> collectionZzc = zzfhl.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzfha zzfhaVar : collectionZzc) {
            if (zzfhaVar != this && zzfhaVar.zzf() == view) {
                zzfhaVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgw
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfhl.zza().zzf(this);
        this.zzf.zzh(zzfhr.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfhx zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
