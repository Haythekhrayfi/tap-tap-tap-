package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.developer.filepicker.model.DialogConfigs;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5548a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static com.applovin.exoplayer2.g.a.InterfaceC0092a a(y yVar) {
        int iQ = yVar.q() + yVar.c();
        int iQ2 = yVar.q();
        int i10 = (iQ2 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iQ2;
                if (i11 == 6516084) {
                    com.applovin.exoplayer2.g.e.e eVarA = a(iQ2, yVar);
                    yVar.d(iQ);
                    return eVarA;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    com.applovin.exoplayer2.g.e.l lVarA = a(iQ2, "TIT2", yVar);
                    yVar.d(iQ);
                    return lVarA;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    com.applovin.exoplayer2.g.e.l lVarA2 = a(iQ2, "TCOM", yVar);
                    yVar.d(iQ);
                    return lVarA2;
                }
                if (i11 == 6578553) {
                    com.applovin.exoplayer2.g.e.l lVarA3 = a(iQ2, "TDRC", yVar);
                    yVar.d(iQ);
                    return lVarA3;
                }
                if (i11 == 4280916) {
                    com.applovin.exoplayer2.g.e.l lVarA4 = a(iQ2, "TPE1", yVar);
                    yVar.d(iQ);
                    return lVarA4;
                }
                if (i11 == 7630703) {
                    com.applovin.exoplayer2.g.e.l lVarA5 = a(iQ2, "TSSE", yVar);
                    yVar.d(iQ);
                    return lVarA5;
                }
                if (i11 == 6384738) {
                    com.applovin.exoplayer2.g.e.l lVarA6 = a(iQ2, "TALB", yVar);
                    yVar.d(iQ);
                    return lVarA6;
                }
                if (i11 == 7108978) {
                    com.applovin.exoplayer2.g.e.l lVarA7 = a(iQ2, "USLT", yVar);
                    yVar.d(iQ);
                    return lVarA7;
                }
                if (i11 == 6776174) {
                    com.applovin.exoplayer2.g.e.l lVarA8 = a(iQ2, "TCON", yVar);
                    yVar.d(iQ);
                    return lVarA8;
                }
                if (i11 == 6779504) {
                    com.applovin.exoplayer2.g.e.l lVarA9 = a(iQ2, "TIT1", yVar);
                    yVar.d(iQ);
                    return lVarA9;
                }
            } else {
                if (iQ2 == 1735291493) {
                    com.applovin.exoplayer2.g.e.l lVarB = b(yVar);
                    yVar.d(iQ);
                    return lVarB;
                }
                if (iQ2 == 1684632427) {
                    com.applovin.exoplayer2.g.e.l lVarB2 = b(iQ2, "TPOS", yVar);
                    yVar.d(iQ);
                    return lVarB2;
                }
                if (iQ2 == 1953655662) {
                    com.applovin.exoplayer2.g.e.l lVarB3 = b(iQ2, "TRCK", yVar);
                    yVar.d(iQ);
                    return lVarB3;
                }
                if (iQ2 == 1953329263) {
                    com.applovin.exoplayer2.g.e.h hVarA = a(iQ2, "TBPM", yVar, true, false);
                    yVar.d(iQ);
                    return hVarA;
                }
                if (iQ2 == 1668311404) {
                    com.applovin.exoplayer2.g.e.h hVarA2 = a(iQ2, "TCMP", yVar, true, true);
                    yVar.d(iQ);
                    return hVarA2;
                }
                if (iQ2 == 1668249202) {
                    com.applovin.exoplayer2.g.e.a aVarC = c(yVar);
                    yVar.d(iQ);
                    return aVarC;
                }
                if (iQ2 == 1631670868) {
                    com.applovin.exoplayer2.g.e.l lVarA10 = a(iQ2, "TPE2", yVar);
                    yVar.d(iQ);
                    return lVarA10;
                }
                if (iQ2 == 1936682605) {
                    com.applovin.exoplayer2.g.e.l lVarA11 = a(iQ2, "TSOT", yVar);
                    yVar.d(iQ);
                    return lVarA11;
                }
                if (iQ2 == 1936679276) {
                    com.applovin.exoplayer2.g.e.l lVarA12 = a(iQ2, "TSO2", yVar);
                    yVar.d(iQ);
                    return lVarA12;
                }
                if (iQ2 == 1936679282) {
                    com.applovin.exoplayer2.g.e.l lVarA13 = a(iQ2, "TSOA", yVar);
                    yVar.d(iQ);
                    return lVarA13;
                }
                if (iQ2 == 1936679265) {
                    com.applovin.exoplayer2.g.e.l lVarA14 = a(iQ2, "TSOP", yVar);
                    yVar.d(iQ);
                    return lVarA14;
                }
                if (iQ2 == 1936679791) {
                    com.applovin.exoplayer2.g.e.l lVarA15 = a(iQ2, "TSOC", yVar);
                    yVar.d(iQ);
                    return lVarA15;
                }
                if (iQ2 == 1920233063) {
                    com.applovin.exoplayer2.g.e.h hVarA3 = a(iQ2, "ITUNESADVISORY", yVar, false, false);
                    yVar.d(iQ);
                    return hVarA3;
                }
                if (iQ2 == 1885823344) {
                    com.applovin.exoplayer2.g.e.h hVarA4 = a(iQ2, "ITUNESGAPLESS", yVar, false, true);
                    yVar.d(iQ);
                    return hVarA4;
                }
                if (iQ2 == 1936683886) {
                    com.applovin.exoplayer2.g.e.l lVarA16 = a(iQ2, "TVSHOWSORT", yVar);
                    yVar.d(iQ);
                    return lVarA16;
                }
                if (iQ2 == 1953919848) {
                    com.applovin.exoplayer2.g.e.l lVarA17 = a(iQ2, "TVSHOW", yVar);
                    yVar.d(iQ);
                    return lVarA17;
                }
                if (iQ2 == 757935405) {
                    com.applovin.exoplayer2.g.e.h hVarA5 = a(yVar, iQ);
                    yVar.d(iQ);
                    return hVarA5;
                }
            }
            q.a("MetadataUtil", "Skipped unknown metadata entry: " + a.c(iQ2));
            yVar.d(iQ);
            return null;
        } catch (Throwable th) {
            yVar.d(iQ);
            throw th;
        }
    }

    private static com.applovin.exoplayer2.g.e.e a(int i10, y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            String strG = yVar.g(iQ - 16);
            return new com.applovin.exoplayer2.g.e.e("und", strG, strG);
        }
        StringBuilder sbA = defpackage.a.a("Failed to parse comment attribute: ");
        sbA.append(a.c(i10));
        q.c("MetadataUtil", sbA.toString());
        return null;
    }

    private static com.applovin.exoplayer2.g.e.h a(int i10, String str, y yVar, boolean z10, boolean z11) {
        int iD = d(yVar);
        if (z11) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z10 ? new com.applovin.exoplayer2.g.e.l(str, null, Integer.toString(iD)) : new com.applovin.exoplayer2.g.e.e("und", str, Integer.toString(iD));
        }
        StringBuilder sbA = defpackage.a.a("Failed to parse uint8 attribute: ");
        sbA.append(a.c(i10));
        q.c("MetadataUtil", sbA.toString());
        return null;
    }

    private static com.applovin.exoplayer2.g.e.h a(y yVar, int i10) {
        int i11 = -1;
        int i12 = -1;
        String strG = null;
        String strG2 = null;
        while (yVar.c() < i10) {
            int iC = yVar.c();
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            yVar.e(4);
            if (iQ2 == 1835360622) {
                strG = yVar.g(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strG2 = yVar.g(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iC;
                    i12 = iQ;
                }
                yVar.e(iQ - 12);
            }
        }
        if (strG == null || strG2 == null || i11 == -1) {
            return null;
        }
        yVar.d(i11);
        yVar.e(16);
        return new com.applovin.exoplayer2.g.e.i(strG, strG2, yVar.g(i12 - 16));
    }

    private static com.applovin.exoplayer2.g.e.l a(int i10, String str, y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            return new com.applovin.exoplayer2.g.e.l(str, null, yVar.g(iQ - 16));
        }
        StringBuilder sbA = defpackage.a.a("Failed to parse text attribute: ");
        sbA.append(a.c(i10));
        q.c("MetadataUtil", sbA.toString());
        return null;
    }

    public static com.applovin.exoplayer2.g.f.a a(y yVar, int i10, String str) {
        while (true) {
            int iC = yVar.c();
            if (iC >= i10) {
                return null;
            }
            int iQ = yVar.q();
            if (yVar.q() == 1684108385) {
                int iQ2 = yVar.q();
                int iQ3 = yVar.q();
                int i11 = iQ - 16;
                byte[] bArr = new byte[i11];
                yVar.a(bArr, 0, i11);
                return new com.applovin.exoplayer2.g.f.a(str, bArr, iQ3, iQ2);
            }
            yVar.d(iC + iQ);
        }
    }

    public static void a(int i10, r rVar, v.a aVar) {
        if (i10 == 1 && rVar.a()) {
            aVar.n(rVar.f6127a).o(rVar.f6128b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static void a(int i10, com.applovin.exoplayer2.g.a aVar, com.applovin.exoplayer2.g.a aVar2, v.a aVar3, com.applovin.exoplayer2.g.a... aVarArr) {
        com.applovin.exoplayer2.g.a aVar4 = new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.a.InterfaceC0092a[0]);
        if (i10 == 1) {
            if (aVar == null) {
                aVar = aVar4;
                break;
            }
        } else {
            if (i10 != 2 || aVar2 == null) {
                aVar = aVar4;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= aVar2.a()) {
                    aVar = aVar4;
                    break;
                }
                com.applovin.exoplayer2.g.a.InterfaceC0092a interfaceC0092aA = aVar2.a(i11);
                if (interfaceC0092aA instanceof com.applovin.exoplayer2.g.f.a) {
                    com.applovin.exoplayer2.g.f.a aVar5 = (com.applovin.exoplayer2.g.f.a) interfaceC0092aA;
                    if ("com.android.capture.fps".equals(aVar5.f6402a)) {
                        aVar = new com.applovin.exoplayer2.g.a(aVar5);
                        break;
                    }
                }
                i11++;
            }
        }
        for (com.applovin.exoplayer2.g.a aVar6 : aVarArr) {
            aVar = aVar.a(aVar6);
        }
        if (aVar.a() > 0) {
            aVar3.a(aVar);
        }
    }

    private static com.applovin.exoplayer2.g.e.l b(int i10, String str, y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385 && iQ >= 22) {
            yVar.e(10);
            int i11 = yVar.i();
            if (i11 > 0) {
                String strA = android.support.v4.media.a.a("", i11);
                int i12 = yVar.i();
                if (i12 > 0) {
                    strA = strA + DialogConfigs.DIRECTORY_SEPERATOR + i12;
                }
                return new com.applovin.exoplayer2.g.e.l(str, null, strA);
            }
        }
        StringBuilder sbA = defpackage.a.a("Failed to parse index/count attribute: ");
        sbA.append(a.c(i10));
        q.c("MetadataUtil", sbA.toString());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static com.applovin.exoplayer2.g.e.l b(y yVar) {
        String str;
        int iD = d(yVar);
        if (iD > 0) {
            String[] strArr = f5548a;
            if (iD <= strArr.length) {
                str = strArr[iD - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new com.applovin.exoplayer2.g.e.l("TCON", null, str);
        }
        q.c("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static com.applovin.exoplayer2.g.e.a c(y yVar) {
        String strA;
        String str;
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            int iB = a.b(yVar.q());
            if (iB == 13) {
                str = "image/jpeg";
            } else {
                str = iB == 14 ? "image/png" : null;
            }
            if (str != null) {
                yVar.e(4);
                int i10 = iQ - 16;
                byte[] bArr = new byte[i10];
                yVar.a(bArr, 0, i10);
                return new com.applovin.exoplayer2.g.e.a(str, null, 3, bArr);
            }
            strA = android.support.v4.media.a.a("Unrecognized cover art flags: ", iB);
        } else {
            strA = "Failed to parse cover art attribute";
        }
        q.c("MetadataUtil", strA);
        return null;
    }

    private static int d(y yVar) {
        yVar.e(4);
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            return yVar.h();
        }
        q.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
