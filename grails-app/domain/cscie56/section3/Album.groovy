package cscie56.section3

class Album {

    String title
    String genre
    Integer length
    Artist artist
    static belongsTo = [artist: Artist]
    static constraints = {
        genre nullable:true, inList: ['jazz', 'rock', 'classical']

    }
}
