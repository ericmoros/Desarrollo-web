(() => {
    const RGX_TEXT = /^[A-Z][a-zA-Z\ ]*$/
    const RGX_TEXTAREA = /^[A-Z][a-zA-Z\ ]{5,10}$/
    const RGX_EMAIL = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
    const RGX_URL = /https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%_\+.~#?&//=]*)/
    var fields

    $(document.body).ready(function () {
        fields = $('input[type="text"], input[type="email"], input[type="url"], textarea')
        fields.on('keyup', function () {
            validate($(this))
        })
        $(document.forms.generic).on('submit', function () {
            return validateAll()
        })
        Array.from(fields).forEach(field => {
            if (field.value != "")
                validate($(field))
        })
    })

    function validateAll() {
        var validation
        var errors = 0
        Array.from(fields).forEach(field => {
            validation = validate($(field))
            if (!validation.isValid) errors++
        })
        if (errors > 0) validation = false
        else validation = true
        return validation
    }

    function validate(field) {
        function isValid(val, type) {
            var isValid
            var error
            switch (type) {
                case 'text':
                    isValid = RGX_TEXT.test(val)
                    error = `"${val}" is not a valid text. Capitalize the string`
                    break
                case 'textarea':
                    isValid = RGX_TEXTAREA.test(val)
                    error = `"${val}" is not a valid textarea. Length from 5 to 10 characters`
                    break
                case 'email':
                    isValid = RGX_EMAIL.test(val)
                    error = `"${val}" is not a valid email. Example: test@site.com`
                    break
                case 'url':
                    isValid = RGX_URL.test(val)
                    error = `"${val}" is not a valid url. Example: http://help.com`
                    break
                default:
                    isValid = false
                    error = 'error'
                    break
            }
            return { isValid, error }
        }

        var val = field.parent().siblings(0)
        var type = field.attr('type')
        var valid = isValid(field.val(), type)
        if (valid.isValid) {
            val.hide()
            field.get(0).setCustomValidity('')
        } else {
            val.html(valid.error)
            field.get(0).setCustomValidity(valid.error)
            val.show()
        }

        return valid
    }
})()
