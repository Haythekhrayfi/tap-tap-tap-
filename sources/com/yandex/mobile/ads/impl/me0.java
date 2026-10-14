package com.yandex.mobile.ads.impl;

import com.developer.filepicker.model.DialogConfigs;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.InternalFrame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;

/* JADX INFO: loaded from: classes3.dex */
final class me0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f23043a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static ApicFrame a(mp0 mp0Var) {
        String str;
        int iH = mp0Var.h();
        if (mp0Var.h() != 1684108385) {
            p90.d("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iH2 = mp0Var.h() & 16777215;
        if (iH2 == 13) {
            str = "image/jpeg";
        } else {
            str = iH2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            o80.a("Unrecognized cover art flags: ", iH2, "MetadataUtil");
            return null;
        }
        mp0Var.f(4);
        int i10 = iH - 16;
        byte[] bArr = new byte[i10];
        mp0Var.a(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    private static CommentFrame a(int i10, mp0 mp0Var) {
        int iH = mp0Var.h();
        if (mp0Var.h() == 1684108385) {
            mp0Var.f(8);
            String strB = mp0Var.b(iH - 16);
            return new CommentFrame("und", strB, strB);
        }
        StringBuilder sbA = v60.a("Failed to parse comment attribute: ");
        sbA.append(rb.a(i10));
        p90.d("MetadataUtil", sbA.toString());
        return null;
    }

    private static Id3Frame a(int i10, String str, mp0 mp0Var, boolean z10, boolean z11) {
        int iMin;
        mp0Var.f(4);
        if (mp0Var.h() == 1684108385) {
            mp0Var.f(8);
            iMin = mp0Var.t();
        } else {
            p90.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(iMin)) : new CommentFrame("und", str, Integer.toString(iMin));
        }
        StringBuilder sbA = v60.a("Failed to parse uint8 attribute: ");
        sbA.append(rb.a(i10));
        p90.d("MetadataUtil", sbA.toString());
        return null;
    }

    private static TextInformationFrame a(int i10, mp0 mp0Var, String str) {
        int iH = mp0Var.h();
        if (mp0Var.h() == 1684108385 && iH >= 22) {
            mp0Var.f(10);
            int iZ = mp0Var.z();
            if (iZ > 0) {
                String strA = u60.a("", iZ);
                int iZ2 = mp0Var.z();
                if (iZ2 > 0) {
                    strA = strA + DialogConfigs.DIRECTORY_SEPERATOR + iZ2;
                }
                return new TextInformationFrame(str, null, strA);
            }
        }
        StringBuilder sbA = v60.a("Failed to parse index/count attribute: ");
        sbA.append(rb.a(i10));
        p90.d("MetadataUtil", sbA.toString());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    public static Id3Frame b(mp0 mp0Var) {
        String str;
        int iH = mp0Var.h() + mp0Var.d();
        int iH2 = mp0Var.h();
        int i10 = (iH2 >> 24) & 255;
        Id3Frame internalFrame = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iH2;
                if (i11 == 6516084) {
                    CommentFrame commentFrameA = a(iH2, mp0Var);
                    mp0Var.e(iH);
                    return commentFrameA;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    TextInformationFrame textInformationFrameB = b(iH2, mp0Var, "TIT2");
                    mp0Var.e(iH);
                    return textInformationFrameB;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    TextInformationFrame textInformationFrameB2 = b(iH2, mp0Var, "TCOM");
                    mp0Var.e(iH);
                    return textInformationFrameB2;
                }
                if (i11 == 6578553) {
                    TextInformationFrame textInformationFrameB3 = b(iH2, mp0Var, "TDRC");
                    mp0Var.e(iH);
                    return textInformationFrameB3;
                }
                if (i11 == 4280916) {
                    TextInformationFrame textInformationFrameB4 = b(iH2, mp0Var, "TPE1");
                    mp0Var.e(iH);
                    return textInformationFrameB4;
                }
                if (i11 == 7630703) {
                    TextInformationFrame textInformationFrameB5 = b(iH2, mp0Var, "TSSE");
                    mp0Var.e(iH);
                    return textInformationFrameB5;
                }
                if (i11 == 6384738) {
                    TextInformationFrame textInformationFrameB6 = b(iH2, mp0Var, "TALB");
                    mp0Var.e(iH);
                    return textInformationFrameB6;
                }
                if (i11 == 7108978) {
                    TextInformationFrame textInformationFrameB7 = b(iH2, mp0Var, "USLT");
                    mp0Var.e(iH);
                    return textInformationFrameB7;
                }
                if (i11 == 6776174) {
                    TextInformationFrame textInformationFrameB8 = b(iH2, mp0Var, "TCON");
                    mp0Var.e(iH);
                    return textInformationFrameB8;
                }
                if (i11 == 6779504) {
                    TextInformationFrame textInformationFrameB9 = b(iH2, mp0Var, "TIT1");
                    mp0Var.e(iH);
                    return textInformationFrameB9;
                }
            } else {
                int iT = -1;
                if (iH2 == 1735291493) {
                    mp0Var.f(4);
                    if (mp0Var.h() == 1684108385) {
                        mp0Var.f(8);
                        iT = mp0Var.t();
                    } else {
                        p90.d("MetadataUtil", "Failed to parse uint8 attribute value");
                    }
                    if (iT > 0) {
                        String[] strArr = f23043a;
                        if (iT <= 192) {
                            str = strArr[iT - 1];
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        internalFrame = new TextInformationFrame("TCON", null, str);
                    } else {
                        p90.d("MetadataUtil", "Failed to parse standard genre code");
                    }
                    mp0Var.e(iH);
                    return internalFrame;
                }
                if (iH2 == 1684632427) {
                    TextInformationFrame textInformationFrameA = a(iH2, mp0Var, "TPOS");
                    mp0Var.e(iH);
                    return textInformationFrameA;
                }
                if (iH2 == 1953655662) {
                    TextInformationFrame textInformationFrameA2 = a(iH2, mp0Var, "TRCK");
                    mp0Var.e(iH);
                    return textInformationFrameA2;
                }
                if (iH2 == 1953329263) {
                    Id3Frame id3FrameA = a(iH2, "TBPM", mp0Var, true, false);
                    mp0Var.e(iH);
                    return id3FrameA;
                }
                if (iH2 == 1668311404) {
                    Id3Frame id3FrameA2 = a(iH2, "TCMP", mp0Var, true, true);
                    mp0Var.e(iH);
                    return id3FrameA2;
                }
                if (iH2 == 1668249202) {
                    ApicFrame apicFrameA = a(mp0Var);
                    mp0Var.e(iH);
                    return apicFrameA;
                }
                if (iH2 == 1631670868) {
                    TextInformationFrame textInformationFrameB10 = b(iH2, mp0Var, "TPE2");
                    mp0Var.e(iH);
                    return textInformationFrameB10;
                }
                if (iH2 == 1936682605) {
                    TextInformationFrame textInformationFrameB11 = b(iH2, mp0Var, "TSOT");
                    mp0Var.e(iH);
                    return textInformationFrameB11;
                }
                if (iH2 == 1936679276) {
                    TextInformationFrame textInformationFrameB12 = b(iH2, mp0Var, "TSO2");
                    mp0Var.e(iH);
                    return textInformationFrameB12;
                }
                if (iH2 == 1936679282) {
                    TextInformationFrame textInformationFrameB13 = b(iH2, mp0Var, "TSOA");
                    mp0Var.e(iH);
                    return textInformationFrameB13;
                }
                if (iH2 == 1936679265) {
                    TextInformationFrame textInformationFrameB14 = b(iH2, mp0Var, "TSOP");
                    mp0Var.e(iH);
                    return textInformationFrameB14;
                }
                if (iH2 == 1936679791) {
                    TextInformationFrame textInformationFrameB15 = b(iH2, mp0Var, "TSOC");
                    mp0Var.e(iH);
                    return textInformationFrameB15;
                }
                if (iH2 == 1920233063) {
                    Id3Frame id3FrameA3 = a(iH2, "ITUNESADVISORY", mp0Var, false, false);
                    mp0Var.e(iH);
                    return id3FrameA3;
                }
                if (iH2 == 1885823344) {
                    Id3Frame id3FrameA4 = a(iH2, "ITUNESGAPLESS", mp0Var, false, true);
                    mp0Var.e(iH);
                    return id3FrameA4;
                }
                if (iH2 == 1936683886) {
                    TextInformationFrame textInformationFrameB16 = b(iH2, mp0Var, "TVSHOWSORT");
                    mp0Var.e(iH);
                    return textInformationFrameB16;
                }
                if (iH2 == 1953919848) {
                    TextInformationFrame textInformationFrameB17 = b(iH2, mp0Var, "TVSHOW");
                    mp0Var.e(iH);
                    return textInformationFrameB17;
                }
                if (iH2 == 757935405) {
                    String strB = null;
                    String strB2 = null;
                    int i12 = -1;
                    int i13 = -1;
                    while (mp0Var.d() < iH) {
                        int iD = mp0Var.d();
                        int iH3 = mp0Var.h();
                        int iH4 = mp0Var.h();
                        mp0Var.f(4);
                        if (iH4 == 1835360622) {
                            strB = mp0Var.b(iH3 - 12);
                        } else if (iH4 == 1851878757) {
                            strB2 = mp0Var.b(iH3 - 12);
                        } else {
                            if (iH4 == 1684108385) {
                                i12 = iD;
                                i13 = iH3;
                            }
                            mp0Var.f(iH3 - 12);
                        }
                    }
                    if (strB != null && strB2 != null && i12 != -1) {
                        mp0Var.e(i12);
                        mp0Var.f(16);
                        internalFrame = new InternalFrame(strB, strB2, mp0Var.b(i13 - 16));
                    }
                    mp0Var.e(iH);
                    return internalFrame;
                }
            }
            p90.a("MetadataUtil", "Skipped unknown metadata entry: " + rb.a(iH2));
            mp0Var.e(iH);
            return null;
        } catch (Throwable th) {
            mp0Var.e(iH);
            throw th;
        }
    }

    private static TextInformationFrame b(int i10, mp0 mp0Var, String str) {
        int iH = mp0Var.h();
        if (mp0Var.h() == 1684108385) {
            mp0Var.f(8);
            return new TextInformationFrame(str, null, mp0Var.b(iH - 16));
        }
        StringBuilder sbA = v60.a("Failed to parse text attribute: ");
        sbA.append(rb.a(i10));
        p90.d("MetadataUtil", sbA.toString());
        return null;
    }
}
