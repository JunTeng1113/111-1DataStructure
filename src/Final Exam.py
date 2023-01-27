start = [2, 8] # 起點
end = [1, 1] # 終點
maze = [
    ['■', '■', '■', '■', '■', '■', '■', '■', '■', '■'],
    ['■', '0', '■', '0', '0', '■', '0', '■', '0', '■'],
    ['■', '0', '■', '■', '0', '■', '0', '■', '0', '■'],
    ['■', '0', '■', '0', '0', '■', '0', '■', '0', '■'],
    ['■', '0', '0', '0', '■', '■', '0', '0', '0', '■'],
    ['■', '0', '■', '0', '■', '0', '0', '■', '0', '■'],
    ['■', '0', '■', '0', '0', '■', '0', '■', '0', '■'],
    ['■', '0', '■', '0', '■', '■', '0', '0', '0', '■'],
    ['■', '0', '0', '0', '0', '0', '0', '■', '0', '■'],
    ['■', '■', '■', '■', '■', '■', '■', '■', '■', '■'],
]

def findPath(y, x):
    if (y == end[0] and x == end[1]):
        maze[y][x] = '★'
        return True

    elif (maze[y][x] == '0'):
        if (y == start[0] and x == start[1]):
            maze[y][x] = '☆'
        else:
            maze[y][x] = '1'
            
        if (findPath(y - 1, x) or findPath(y + 1, x) or findPath(y, x - 1) or findPath(y, x + 1)):
            return True
        else:
            maze[y][x] = 'x'
            return False
    else:
        return False

print('\n'.join(map(lambda x: ' '.join(x), maze)))
print()
findPath(start[0], start[1])
print('\n'.join(map(lambda x: ' '.join(x), maze)))