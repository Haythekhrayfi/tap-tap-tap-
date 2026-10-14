package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpm;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgpi<MessageType extends zzgpm<MessageType, BuilderType>, BuilderType extends zzgpi<MessageType, BuilderType>> extends zzgnm<MessageType, BuilderType> {
    public zzgpm zza;
    private final zzgpm zzb;

    public zzgpi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzgre.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgpi zzah() {
        zzgpi zzgpiVar = (zzgpi) this.zzb.zzb(5, null, null);
        zzgpiVar.zza = zzan();
        return zzgpiVar;
    }

    public final zzgpi zzaj(zzgpm zzgpmVar) {
        if (!this.zzb.equals(zzgpmVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgpmVar);
        }
        return this;
    }

    public final zzgpi zzak(byte[] bArr, int i10, int i11, zzgoy zzgoyVar) throws zzgpy {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgre.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgnq(zzgoyVar));
            return this;
        } catch (zzgpy e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgpy.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType messagetype = (MessageType) zzan();
        if (messagetype.zzaX()) {
            return messagetype;
        }
        throw new zzgsf(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgqv
    /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    public final void zzap() {
        if (this.zza.zzaY()) {
            return;
        }
        zzaq();
    }

    public void zzaq() {
        zzgpm zzgpmVarZzaD = this.zzb.zzaD();
        zza(zzgpmVarZzaD, this.zza);
        this.zza = zzgpmVarZzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final /* synthetic */ zzgqw zzbf() {
        throw null;
    }
}
