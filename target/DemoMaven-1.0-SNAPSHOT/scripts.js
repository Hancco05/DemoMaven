function mostrarMensaje() {
    const consejos = [
        "Tómate un descanso y respira profundamente.",
        "Conecta con amigos o familiares.",
        "Escribe tus pensamientos en un diario.",
        "Sal a caminar y disfruta del aire libre.",
        "Escucha tu música favorita para relajarte."
    ];

    // Selecciona un consejo aleatorio
    let consejo = consejos[Math.floor(Math.random() * consejos.length)];
    document.getElementById('mensaje').innerText = consejo;
}
