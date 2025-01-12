// Groovy Script file
def buildApp() {
    echo "building application ${params.VERSION}..."
}

def testApp() {
    echo "testing application ${params.VERSION}..."
}

def deployApp() {
    echo "deploying application ${params.VERSION}..."
}

return this
