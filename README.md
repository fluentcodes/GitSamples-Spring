# GitSample Topic Branch: Vue.js CLI Created

This is just the vue project created by vue cli. 
It's contains a simple [HelloWorld.vue](src/components/HelloWorld.vue) and a static
[index.html](public/index.html) page. 

## Run
     npm run serve

will start the server with the following code: 

    > vue-sandbox@0.1.0 serve
    > vue-cli-service serve
    
     INFO  Starting development server...

     DONE  Compiled successfully in 1513ms                                                                              09:15:57

    App running at:
      - Local:   http://localhost:8080/ 
      - Network: http://192.168.178.105:8080/

      Note that the development build is not optimized.
      To create a production build, run npm run build.

After that we can curl the available the index page:

     curl localhost:8080/index.html

shows the index.html page. 

When opening it in the browser the javascript part with /js/app.js will change the result starting HelloWorld.vue.  


## Installing Vue CLI
Install node with the provided installer from https://nodejs.org/en/download/

Then run the command 

    npm update -g @vue/cli

Depending on your environment it could be a bit tricky e.g. using sudo. The symptom was that the vue command was not found out of the box(https://stackoverflow.com/questions/51005638/mac-os-install-vue-cli-does-work-properly). 

For me a node reinstallation and the command 

    sudo npm install -g @vue/cli@latest

worked finally. 

## Create project
With 

     vue create vue-sandbox

a new project will be created similar to the one you find here. 

First I've selected the default:

     Vue CLI v5.0.3
     ? Please pick a preset: (Use arrow keys)
     ❯ Default ([Vue 3] babel, eslint) 
       Default ([Vue 2] babel, eslint) 
       Manually select features 

Then a lot stuff will be loaded: 

     Vue CLI v5.0.3
     ✨  Creating project in /Users/werner/dev/experimental/vue-sandbox.
     🗃  Initializing git repository...
     ⚙️  Installing CLI plugins. This might take a while...


Finally: 

    added 859 packages, and audited 860 packages in 18s
    
    92 packages are looking for funding
      run `npm fund` for details
    
    7 moderate severity vulnerabilities
    
    To address all issues (including breaking changes), run:
      npm audit fix --force
    
    Run `npm audit` for details.
    🚀  Invoking generators...
    📦  Installing additional dependencies...
    
    
    added 97 packages, and audited 957 packages in 5s
    
    102 packages are looking for funding
      run `npm fund` for details
    
    7 moderate severity vulnerabilities
    
    To address all issues (including breaking changes), run:
      npm audit fix --force
    
    Run `npm audit` for details.
    ⚓  Running completion hooks...
    
    📄  Generating README.md...
    
    🎉  Successfully created project vue-sandbox.
    👉  Get started with the following commands:
    
     $ cd vue-sandbox
     $ npm run serve

## Links
* https://www.statista.com/statistics/1124699/worldwide-developer-survey-most-used-frameworks-web/
* https://learnvue.co/2020/12/setting-up-your-first-vue3-project-vue-3-0-release/#vue-cli
* https://stackoverflow.com/questions/51005638/mac-os-install-vue-cli-does-work-properly
* https://nodejs.org/en/download/
* https://stackoverflow.com/questions/22924633/gitignore-is-not-ignoring-directories
* https://www.positronx.io/should-i-commit-the-node_modules-folder-to-git/
* https://stackoverflow.com/questions/11459475/should-i-check-in-folder-node-modules-to-git-when-creating-a-node-js-app-on-he