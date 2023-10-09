package `Part2-Basic`

class PersonKotlin(
        val name: String, // 읽기 전용 프로퍼티, 공개 Getter를 만듦.
        var isMarried: Boolean // 쓸 수 있는 프로퍼티, 비공개 필드와 공개 Getter/Setter를 만듦.
)
