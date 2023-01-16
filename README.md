Git Commands

#initialise a local git repo
git init

git add * (adds all files to be staged to commit to local repo)
git commit -m "commit msg"
git branch (show existing branch)
git branch --list (show all branches you have locally)
git branch -M main (switch from master to main branch)

git remote add origin <url>
git push -u origin main (push to remote repo from main branch)

#to remove remote origin
git remote -v
git rm (origin/destination)

#after making modifications, 
git pull