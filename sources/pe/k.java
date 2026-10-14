package pe;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<Map.Entry<String, Long>> f34692c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Map.Entry<re.i, Locale>, Object> f34693b = new ConcurrentHashMap(16, 0.75f, 2);

    public class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<l, Map<Long, String>> f34694a;

        public b(Map<l, Map<Long, String>> map) {
            this.f34694a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (l lVar : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(lVar).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    Comparator<Map.Entry<String, Long>> comparator = k.f34692c;
                    map3.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Comparator<Map.Entry<String, Long>> comparator2 = k.f34692c;
                Collections.sort(arrayList2, k.f34692c);
                map2.put(lVar, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Comparator<Map.Entry<String, Long>> comparator3 = k.f34692c;
            Collections.sort(arrayList, k.f34692c);
        }

        public String a(long j10, l lVar) {
            Map<Long, String> map = this.f34694a.get(lVar);
            if (map != null) {
                return map.get(Long.valueOf(j10));
            }
            return null;
        }
    }

    public static b b(Map<l, Map<Long, String>> map) {
        map.put(l.FULL_STANDALONE, map.get(l.FULL));
        map.put(l.SHORT_STANDALONE, map.get(l.SHORT));
        l lVar = l.NARROW;
        if (map.containsKey(lVar)) {
            l lVar2 = l.NARROW_STANDALONE;
            if (!map.containsKey(lVar2)) {
                map.put(lVar2, map.get(lVar));
            }
        }
        return new b(map);
    }

    @Override // pe.g
    public String a(re.i iVar, long j10, l lVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object objB;
        HashMap map;
        HashMap map2;
        l lVar2;
        k kVar = this;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(iVar, locale);
        Object obj = kVar.f34693b.get(simpleImmutableEntry2);
        if (obj == null) {
            if (iVar == re.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map3 = new HashMap();
                simpleImmutableEntry = simpleImmutableEntry2;
                String[] months = dateFormatSymbols.getMonths();
                HashMap map4 = new HashMap();
                map4.put(1L, months[0]);
                map4.put(2L, months[1]);
                map4.put(3L, months[2]);
                map4.put(4L, months[3]);
                map4.put(5L, months[4]);
                map4.put(6L, months[5]);
                map4.put(7L, months[6]);
                map4.put(8L, months[7]);
                map4.put(9L, months[8]);
                map4.put(10L, months[9]);
                map4.put(11L, months[10]);
                map4.put(12L, months[11]);
                map3.put(l.FULL, map4);
                HashMap map5 = new HashMap();
                map5.put(1L, d(1, months[0], locale));
                map5.put(2L, d(2, months[1], locale));
                map5.put(3L, d(3, months[2], locale));
                map5.put(4L, d(4, months[3], locale));
                map5.put(5L, d(5, months[4], locale));
                map5.put(6L, d(6, months[5], locale));
                map5.put(7L, d(7, months[6], locale));
                map5.put(8L, d(8, months[7], locale));
                map5.put(9L, d(9, months[8], locale));
                map5.put(10L, d(10, months[9], locale));
                map5.put(11L, d(11, months[10], locale));
                map5.put(12L, d(12, months[11], locale));
                map3.put(l.NARROW, map5);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap map6 = new HashMap();
                map6.put(1L, shortMonths[0]);
                map6.put(2L, shortMonths[1]);
                map6.put(3L, shortMonths[2]);
                map6.put(4L, shortMonths[3]);
                map6.put(5L, shortMonths[4]);
                map6.put(6L, shortMonths[5]);
                map6.put(7L, shortMonths[6]);
                map6.put(8L, shortMonths[7]);
                map6.put(9L, shortMonths[8]);
                map6.put(10L, shortMonths[9]);
                map6.put(11L, shortMonths[10]);
                map6.put(12L, shortMonths[11]);
                map3.put(l.SHORT, map6);
                objB = b(map3);
                kVar = this;
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                if (iVar == re.a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    map = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap map7 = new HashMap();
                    map7.put(1L, weekdays[2]);
                    map7.put(2L, weekdays[3]);
                    map7.put(3L, weekdays[4]);
                    map7.put(4L, weekdays[5]);
                    map7.put(5L, weekdays[6]);
                    map7.put(6L, weekdays[7]);
                    map7.put(7L, weekdays[1]);
                    map.put(l.FULL, map7);
                    HashMap map8 = new HashMap();
                    map8.put(1L, kVar.c(1, weekdays[2], locale));
                    map8.put(2L, kVar.c(2, weekdays[3], locale));
                    map8.put(3L, kVar.c(3, weekdays[4], locale));
                    map8.put(4L, kVar.c(4, weekdays[5], locale));
                    map8.put(5L, kVar.c(5, weekdays[6], locale));
                    map8.put(6L, kVar.c(6, weekdays[7], locale));
                    map8.put(7L, kVar.c(7, weekdays[1], locale));
                    map.put(l.NARROW, map8);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    map2 = new HashMap();
                    map2.put(1L, shortWeekdays[2]);
                    map2.put(2L, shortWeekdays[3]);
                    map2.put(3L, shortWeekdays[4]);
                    map2.put(4L, shortWeekdays[5]);
                    map2.put(5L, shortWeekdays[6]);
                    map2.put(6L, shortWeekdays[7]);
                    map2.put(7L, shortWeekdays[1]);
                    lVar2 = l.SHORT;
                } else if (iVar == re.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap map9 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap map10 = new HashMap();
                    map10.put(0L, amPmStrings[0]);
                    map10.put(1L, amPmStrings[1]);
                    map9.put(l.FULL, map10);
                    map9.put(l.SHORT, map10);
                    objB = b(map9);
                } else if (iVar == re.a.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    map = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap map11 = new HashMap();
                    map11.put(0L, eras[0]);
                    map11.put(1L, eras[1]);
                    map.put(l.SHORT, map11);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap map12 = new HashMap();
                        map12.put(0L, "Before Christ");
                        map12.put(1L, "Anno Domini");
                        map.put(l.FULL, map12);
                    } else {
                        map.put(l.FULL, map11);
                    }
                    map2 = new HashMap();
                    map2.put(0L, eras[0].substring(0, 1));
                    map2.put(1L, eras[1].substring(0, 1));
                    lVar2 = l.NARROW;
                } else if (iVar == re.c.f35365a) {
                    HashMap map13 = new HashMap();
                    HashMap map14 = new HashMap();
                    map14.put(1L, "Q1");
                    map14.put(2L, "Q2");
                    map14.put(3L, "Q3");
                    map14.put(4L, "Q4");
                    map13.put(l.SHORT, map14);
                    HashMap map15 = new HashMap();
                    map15.put(1L, "1st quarter");
                    map15.put(2L, "2nd quarter");
                    map15.put(3L, "3rd quarter");
                    map15.put(4L, "4th quarter");
                    map13.put(l.FULL, map15);
                    objB = b(map13);
                } else {
                    objB = "";
                }
                map.put(lVar2, map2);
                objB = b(map);
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            kVar.f34693b.putIfAbsent(simpleImmutableEntry3, objB);
            obj = kVar.f34693b.get(simpleImmutableEntry3);
        }
        if (obj instanceof b) {
            return ((b) obj).a(j10, lVar);
        }
        return null;
    }

    public final String c(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public final String d(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i10) : str.substring(0, 1);
    }
}
