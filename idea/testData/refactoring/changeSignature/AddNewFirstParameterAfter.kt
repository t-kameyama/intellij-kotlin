fun test(i: Int, s1: String, s2: String, s3: String, s4: String) = Unit

fun usages2() {
    test(42, "s1", "s2", "s3", "s4")
    test(42, "s1", "s2", "s3", s4 = "s4")
    test(42, "s1", "s2", s3 = "s3", s4 = "s4")
    test(42, "s1", "s2", s3 = "s3", s4 = "s4")
    test(42, "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
    test(i = 42, s1 = "s1", s2 = "s2", s3 = "s3", s4 = "s4")
}
