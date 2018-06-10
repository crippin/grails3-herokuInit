package grails3.herokuinit

class BootStrap {

    def init = { servletContext ->
        def authorities = ['ROLE_USER']
        authorities.each {
            if ( !Role.findByAuthority(it) ) {
                new Role(authority: it).save()
            }
        }
        if ( !User.findByUsername('sherlock') ) {
            def u = new User(username: 'egy', password: 'almafa')
            u.save()
            def ur = new UserRole(user: u, role:  Role.findByAuthority('ROLE_USER'))
            ur.save()
        }
    }
    def destroy = {
    }
}
