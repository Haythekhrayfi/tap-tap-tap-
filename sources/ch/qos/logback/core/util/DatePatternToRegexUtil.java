package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import x2.a;
import x2.b;

/* JADX INFO: loaded from: classes.dex */
public class DatePatternToRegexUtil {
    public final String datePattern;
    public final int datePatternLength;
    public final b regexMapper = new b();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<a> tokenize() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (int i10 = 0; i10 < this.datePatternLength; i10++) {
            char cCharAt = this.datePattern.charAt(i10);
            if (aVar == null || aVar.f37422a != cCharAt) {
                aVar = new a(cCharAt);
                arrayList.add(aVar);
            } else {
                aVar.f37423b++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    public String toRegex() {
        StringBuilder sb2;
        String string;
        List<a> list = tokenize();
        StringBuilder sb3 = new StringBuilder();
        for (a aVar : list) {
            b bVar = this.regexMapper;
            Objects.requireNonNull(bVar);
            int i10 = aVar.f37423b;
            char c10 = aVar.f37422a;
            if (c10 == 'y') {
                sb2 = new StringBuilder();
                sb2.append("\\d{");
                sb2.append(i10);
                sb2.append("}");
                string = sb2.toString();
            } else if (c10 != 'z') {
                string = "";
                switch (c10) {
                    case '\'':
                        if (i10 != 1) {
                            throw new IllegalStateException("Too many single quotes");
                        }
                        break;
                        break;
                    case '.':
                        string = "\\.";
                        break;
                    case 'K':
                    case 'S':
                    case 'W':
                    case 'd':
                    case 'h':
                    case 'k':
                    case 'm':
                    case 's':
                    case 'w':
                        sb2 = new StringBuilder();
                        sb2.append("\\d{");
                        sb2.append(i10);
                        sb2.append("}");
                        string = sb2.toString();
                        break;
                    case 'M':
                        if (i10 <= 2) {
                            sb2 = new StringBuilder();
                            sb2.append("\\d{");
                            sb2.append(i10);
                            sb2.append("}");
                            string = sb2.toString();
                        } else if (i10 == 3) {
                            string = bVar.a(bVar.f37424a.getShortMonths());
                        } else {
                            string = bVar.a(bVar.f37424a.getMonths());
                        }
                        break;
                    case 'Z':
                        string = "(\\+|-)\\d{4}";
                        break;
                    case '\\':
                        throw new IllegalStateException("Forward slashes are not allowed");
                    case 'a':
                        string = bVar.a(bVar.f37424a.getAmPmStrings());
                        break;
                    default:
                        switch (c10) {
                            case 'D':
                            case 'F':
                            case 'H':
                                sb2 = new StringBuilder();
                                break;
                            case 'E':
                                if (i10 >= 4) {
                                    string = bVar.a(bVar.f37424a.getWeekdays());
                                    continue;
                                } else {
                                    string = bVar.a(bVar.f37424a.getShortWeekdays());
                                }
                                break;
                            case 'G':
                                string = ".*";
                                continue;
                            default:
                                StringBuilder sb4 = new StringBuilder();
                                if (i10 == 1) {
                                    sb4.append("");
                                    sb4.append(c10);
                                } else {
                                    sb4.append(c10);
                                    sb4.append("{");
                                    sb4.append(i10);
                                    sb4.append("}");
                                }
                                string = sb4.toString();
                                continue;
                        }
                        sb2.append("\\d{");
                        sb2.append(i10);
                        sb2.append("}");
                        string = sb2.toString();
                        break;
                }
            } else {
                string = ".*";
                continue;
            }
            sb3.append(string);
        }
        return sb3.toString();
    }
}
