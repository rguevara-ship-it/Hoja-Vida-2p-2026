package hojadevida.modelo;

/**
 * Modelo de datos para la Hoja de Vida.
 */
public class DatosHojaVida {

    // ========== PERSONALIZA TUS DATOS AQUÍ ==========
    private String nombre = "Ronny Farid Guevara Galvis";
    private String titulo = "Tecnologo em desarrollo de software";
    private String ciudad = "Popayan-Colombia";
    private String telefono = "+57 311 817 4608";
    private String email = "rguevara@unimayor.edu.co";
    private String github = "github.com/rguevara-ship-it";
    private String[] habilidadesTecnicas = {"Java", "Git y GitHub", "Programación"};
    private String[] habilidadesBlandas = {"Trabajo en equipo", "Comunicación", "Resolución de problemas"};
    private String idiomas = "Español - Nativo\nEnglish - Básico (B1)";
    private String perfil = "Estudiante de Desarrollo de software en Unimayor";
    private String experiencia = "2025\n[Desarrollador] - [Unimayor]\n[Popayan]";
    private String educacion = "2025-2026\n[Cursando tecnologia Desarrollo de Software] - [Unimayor]\n[Popayan]";
    private String[] areasInteres = {"VideoJuegos", "Biologia", "Ingles"};
    private String proyectos = "• [Topo Splash] - [Juegos basico para entretenimiento y destreza mental]";
    // =================================================

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    public String[] getHabilidadesTecnicas() { return habilidadesTecnicas; }
    public void setHabilidadesTecnicas(String[] h) { this.habilidadesTecnicas = h; }
    public String[] getHabilidadesBlandas() { return habilidadesBlandas; }
    public void setHabilidadesBlandas(String[] h) { this.habilidadesBlandas = h; }
    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String exp) { this.experiencia = exp; }
    public String getEducacion() { return educacion; }
    public void setEducacion(String ed) { this.educacion = ed; }
    public String[] getAreasInteres() { return areasInteres; }
    public void setAreasInteres(String[] a) { this.areasInteres = a; }
    public String getProyectos() { return proyectos; }
    public void setProyectos(String p) { this.proyectos = p; }

    public String getHabilidadesTecnicasFormateadas() {
        return "• " + String.join("\n• ", habilidadesTecnicas);
    }
    public String getHabilidadesBlandasFormateadas() {
        return "• " + String.join("\n• ", habilidadesBlandas);
    }
    public String getAreasInteresFormateadas() {
        return "• " + String.join("\n• ", areasInteres);
    }
}
