package ch.berta.fabio.npdough

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform