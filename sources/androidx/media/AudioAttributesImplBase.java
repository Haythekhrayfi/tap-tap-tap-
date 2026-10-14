package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2266a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2267b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2268c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2269d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2267b != audioAttributesImplBase.f2267b) {
            return false;
        }
        int i10 = this.f2268c;
        int i11 = audioAttributesImplBase.f2268c;
        int i12 = audioAttributesImplBase.f2269d;
        int i13 = 4;
        if (i12 == -1) {
            int i14 = audioAttributesImplBase.f2266a;
            int i15 = AudioAttributesCompat.f2262b;
            if ((i11 & 1) != 1) {
                if ((i11 & 4) != 4) {
                    switch (i14) {
                        case 2:
                            i13 = 0;
                            break;
                        case 3:
                            i13 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i13 = 5;
                            break;
                        case 6:
                            i13 = 2;
                            break;
                        case 11:
                            i13 = 10;
                            break;
                        case 12:
                        default:
                            i13 = 3;
                            break;
                        case 13:
                            i13 = 1;
                            break;
                    }
                } else {
                    i13 = 6;
                }
            } else {
                i13 = 7;
            }
        } else {
            i13 = i12;
        }
        if (i13 == 6) {
            i11 |= 4;
        } else if (i13 == 7) {
            i11 |= 1;
        }
        return i10 == (i11 & 273) && this.f2266a == audioAttributesImplBase.f2266a && this.f2269d == i12;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2267b), Integer.valueOf(this.f2268c), Integer.valueOf(this.f2266a), Integer.valueOf(this.f2269d)});
    }

    public String toString() {
        String strA;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2269d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2269d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f2266a;
        int i11 = AudioAttributesCompat.f2262b;
        switch (i10) {
            case 0:
                strA = "USAGE_UNKNOWN";
                break;
            case 1:
                strA = "USAGE_MEDIA";
                break;
            case 2:
                strA = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strA = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strA = "USAGE_ALARM";
                break;
            case 5:
                strA = "USAGE_NOTIFICATION";
                break;
            case 6:
                strA = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strA = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strA = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strA = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strA = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strA = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strA = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strA = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strA = "USAGE_GAME";
                break;
            case 15:
            default:
                strA = android.support.v4.media.a.a("unknown usage ", i10);
                break;
            case 16:
                strA = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strA);
        sb2.append(" content=");
        sb2.append(this.f2267b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2268c).toUpperCase());
        return sb2.toString();
    }
}
