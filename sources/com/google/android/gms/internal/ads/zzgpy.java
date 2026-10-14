package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgpy extends IOException {
    private zzgqw zza;
    private boolean zzb;

    public zzgpy(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public zzgpy(String str) {
        super(str);
        this.zza = null;
    }

    public static zzgpx zza() {
        return new zzgpx("Protocol message tag had invalid wire type.");
    }

    public static zzgpy zzb() {
        return new zzgpy("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgpy zzc() {
        return new zzgpy("Protocol message contained an invalid tag (zero).");
    }

    public static zzgpy zzd() {
        return new zzgpy("Protocol message had invalid UTF-8.");
    }

    public static zzgpy zze() {
        return new zzgpy("CodedInputStream encountered a malformed varint.");
    }

    public static zzgpy zzf() {
        return new zzgpy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgpy zzg() {
        return new zzgpy("Failed to parse the message.");
    }

    public static zzgpy zzi() {
        return new zzgpy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgpy zzj() {
        return new zzgpy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgpy zzh(zzgqw zzgqwVar) {
        this.zza = zzgqwVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }
}
