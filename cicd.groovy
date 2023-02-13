node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/libxsltport.git'), string(name: 'PORT_DESCRIPTION', value: 'libxslt is the XSLT C library' )]
  }
}
