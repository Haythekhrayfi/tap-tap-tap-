package w2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class b implements Comparator<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f37084c;

    public b(c cVar) {
        this.f37084c = cVar;
    }

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int iCompareTo = 0;
        for (e eVar : this.f37084c.f37085a) {
            Comparable comparableA = eVar.a(str4);
            Comparable comparableA2 = eVar.a(str3);
            if (comparableA != null && comparableA2 != null) {
                iCompareTo += comparableA.compareTo(comparableA2);
            }
        }
        return iCompareTo == 0 ? str4.compareTo(str3) : iCompareTo;
    }
}
